package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.plaf.basic.BasicScrollBarUI;

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
        JScrollBar scrollBar=scrollPane.getVerticalScrollBar();
        scrollBar.setUI(new CustomScrollBarUI());
        add(scrollPane, BorderLayout.CENTER);
        // ---------------------------
        
    }
    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        mainPanel.setVisible(aFlag);
        body.setVisible(aFlag);
        
    }
    private static class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            // تحديد لون الخلفية لشريط التمرير
            trackColor = ColoringController.getTowColor();
            setThumbBounds(0, 0, 10, 10);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            return createZeroButton();
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            return createZeroButton();
        }

        // إنشاء زر بحجم صفر
        private JButton createZeroButton() {
            JButton button = new JButton();
            Dimension zeroDim = new Dimension(0, 0);
            button.setPreferredSize(zeroDim);
            button.setMinimumSize(zeroDim);
            button.setMaximumSize(zeroDim);
            return button;
        }
        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            // تخصيص لون الشريط المتحرك (Thumb)
            g.setColor(ColoringController.getTowColorDark()); // يمكنك تغيير هذا اللون حسب احتياجاتك
            ((Graphics2D) g).fill(thumbBounds);
        }
    }
}
