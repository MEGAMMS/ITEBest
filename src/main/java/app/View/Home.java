package main.java.app.View;
import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.ColoringController;

public class Home extends JPanel{
    Home(){
        initComponents();
    }
    private void initComponents(){

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
    //----------Top--------------
        JLabel tHome = new JLabel("Home Page");
        tHome.setBounds(10, 0, 300, 50);
        tHome.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
    //---------------------------

    //---------banner------------
        JLabel imgbanner=new JLabel(ImageController.getBanar1Icon());
        imgbanner.setBounds(0, 0, 1180, 250);
        JPanel banner = new JPanel();
        banner.setBackground(ColoringController.getLightBasicColor());
        banner.setBounds(10, 50, 1180, 250);
        banner.add(imgbanner);
        banner.setLayout(null);
    //---------------------------

    //----------menu-------------
        JPanel menu = new JPanel();
        menu.setBackground(ColoringController.getLightGrayColor());
        menu.setBounds(10, 310, 1180, 40);
        menu.setLayout(null);
    //---------------------------
    
    //-----------Body------------
        JPanel body = new JPanel();
        body.setBackground(ColoringController.getLightGrayColor());
        body.setBounds(10, 360, 1180, 1000);
        body.setLayout(new GridLayout(4, 5, 10, 10));
    //---------------------------

    //-------Properites----------
        setBounds(60, 50, 1220, 670);
        setLayout(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(1200,1400));
        mainPanel.add(tHome);
        mainPanel.add(banner);
        mainPanel.add(menu);
        mainPanel.add(body);
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        add(scrollPane,BorderLayout.CENTER);
    //---------------------------
    }
    public JPanel getP(){
        return this;
    }
}
