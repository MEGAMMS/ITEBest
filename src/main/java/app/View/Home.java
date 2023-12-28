package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Model.Database;
import main.java.app.Controller.ColoringController;

public class Home extends JPanel {
    public static JLabel imgbanner = new JLabel(ImageController.getBanar1Icon());
    public static JPanel body;
    JPanel mainPanel = new JPanel();
    int size = MovieCard.sizePanel();

    public void setBody(int n) {
        setVisible(false);
    }

    public Home() {
        initComponents();
    }
    public void initComponents() {
        System.out.println("Comp Home");
        mainPanel.setLayout(null);
        // ----------Top--------------
        JLabel tHome = new JLabel("Home Page");
        tHome.setBounds(10, 0, 300, 50);
        tHome.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        // ---------------------------

        // ---------banner------------
        imgbanner.setBounds(0, 0, 1180, 250);
        JPanel banner = new JPanel();
        banner.setBackground(ColoringController.getTowColorDark());
        banner.setBounds(10, 50, 1180, 250);


        banner.add(imgbanner);
        banner.setLayout(null);
        // ---------------------------

        // // ----------menu-------------
        // JPanel menu = new JPanel();
        // menu.setBackground(ColoringController.getTowColorDark());
        // menu.setBounds(10, 310, 1180, 40);
        // menu.setLayout(null);
        // // ---------------------------

        // -----------Body------------
        body = new JPanel();
        // body.setBackground(Color.decode("#E5E5E5"));
        //body.setBorder(new LineBorder(ColoringController.getLightGrayColor(), 2));
        body.setLayout(null);
        body.setBackground(ColoringController.getTowColor());
        for (int i = 0; i < Database.movies.size(); i++) {
            System.out.println("add film " + (i + 1));
            body.add(new MovieCard(i));
        }
        size = MovieCard.sizePanel();
        body.setBounds(10, 310, 1180, size + 10);
        // ---------------------------

        // -------Properites----------
        this.setName("Home");
        setBounds(60, 50, 1220, 670);
        setLayout(new BorderLayout());

        mainPanel.setPreferredSize(new Dimension(1200, size + 400));
        mainPanel.add(tHome);
        mainPanel.add(banner);
        //mainPanel.add(menu);
        mainPanel.add(body);
        mainPanel.setBackground(ColoringController.getTowColor());
        // mainPanel.add(body);
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
        // ---------------------------
        
    }
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        mainPanel.setVisible(aFlag);
        body.setVisible(aFlag);
        
    }
}
