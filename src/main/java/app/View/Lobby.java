package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Movie;

public class Lobby extends JFrame {
    //Panels
    public static JPanel maiPanel=new JPanel();
    public static JPanel Top = new JPanel();
    public static JPanel toolbar = new JPanel();


    public static Home PHome=new Home();
    public static Profile PProfile = new Profile();
    public static Ticketadd ticketadd=new Ticketadd();
    public static Signup singup = new Signup();
    public static LoginP login = new LoginP();
    public static MoviesView moviesView = new MoviesView();
    public void showAddTicket(Movie movie){
        remove(ticketadd);
        ticketadd=new Ticketadd(movie);
        add(ticketadd);
        ticketadd.setVisible(false);

    }
    public Lobby() {
        initComponents();
    }

    
    private void initComponents() {
        
   
       /*  Cardpanel=new JPanel(new CardLayout());
        Cardpanel.setBounds(60, 50, 1220, 670);
        Cardpanel.add(h,"Home");
        Cardpanel.add(PProfile,"Profile");*/
    
        // -------------Head---------------
        JLabel title = new JLabel("ITEBest");
        JPanel PExit=new JPanel();
        JLabel Exitimh=ImageController.addPhoto("\\Exit.png", 40, 40);
        //JLabel Exitimh=new JLabel();
        //ImageIcon icon = new ImageIcon("src\\main\\resources\\images\\ex.svg"); // تعيين مسار الصورة المتجه
        //Exitimh.setIcon(icon);
        PExit.setBounds(1230, 0, 50, 50);
        PExit.add(Exitimh);
        PExit.setBackground(ColoringController.getBasicColor());
        title.setBounds(600, 0, 300, 50);
        Top.setBounds(0, 0, 1280, 50);
        Top.setLayout(null);
        Top.setBackground(ColoringController.getBasicColor());
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        title.setForeground(ColoringController.getWhiteColor());
        
        Top.add(title);
        Top.add(PExit);
        PanelsController.Exit(PExit);
        // --------------------------------

        // -----------------toolbar----------------
        
        toolbar.setBounds(0, 0, 60, 1000);
        toolbar.setBackground(ColoringController.getBasicColor());
        toolbar.setLayout(null);
        //
        JPanel BProfile = new JPanel();
        BProfile.setName("BProfile");
        BProfile.setLayout(new BorderLayout());
        BProfile.setBounds(0, 70, 60, 100);
        BProfile.add(ImageController.addPhoto("profile.png"), BorderLayout.CENTER);
        BProfile.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(BProfile,"Profile");
        toolbar.add(BProfile);
        //
        JPanel BMovie = new JPanel();
        BMovie.setLayout(new BorderLayout());
        BMovie.setBounds(0, 170, 60, 100);
        BMovie.add(ImageController.addPhoto("movie.png"), BorderLayout.CENTER);
        BMovie.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(BMovie,"");
        toolbar.add(BMovie);
        //
        JPanel BTrend = new JPanel();
        BTrend.setLayout(new BorderLayout());
        BTrend.setBounds(0, 270, 60, 100);
        BTrend.add(ImageController.addPhoto("fire.png"), BorderLayout.CENTER);
        BTrend.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(BTrend,"");
        toolbar.add(BTrend);
        //
        JPanel BHome = new JPanel();
        BHome.setName("BHome");
        BHome.setLayout(new BorderLayout());
        BHome.setBounds(0, 370, 60, 100);
        BHome.add(ImageController.addPhoto("home.png"), BorderLayout.CENTER);
        BHome.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(BHome,"Home");
        PHome.repaint();
        toolbar.add(BHome);
        //
        JPanel Bticket = new JPanel();
        Bticket.setLayout(new BorderLayout());
        Bticket.setBounds(0, 470, 60, 100);
        Bticket.add(ImageController.addPhoto("ticket.png"), BorderLayout.CENTER);
        Bticket.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(Bticket,"");
        toolbar.add(Bticket);
        //
        JPanel BSettings = new JPanel();
        BSettings.setLayout(new BorderLayout());
        BSettings.setBounds(0, 570, 60, 100);
        BSettings.add(ImageController.addPhoto("setting.png"), BorderLayout.CENTER);
        BSettings.setBackground(ColoringController.getBasicColor());
        PanelsController.addToToolbar(BSettings,"");
        toolbar.add(BSettings);
        //
        // -----------------------------
        
        
        // ----------Properties------------
        setIconImage(ImageController.getITEBestIcon().getImage());
        setSize(1280, 720);
        maiPanel.setSize(1280, 720);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Border roundedBorder = new RoundedBorder(10); 
        maiPanel.setBorder(roundedBorder);
        setLayout(null);
        maiPanel.setBorder(roundedBorder);
        maiPanel.setLayout(null);
        maiPanel.add(Top);
        maiPanel.add(toolbar);
        //MainPanels.addPanel(PHome);
        //MainPanels.addPanel(PProfile);
        maiPanel.add(PHome);
        maiPanel.add(PProfile);
        maiPanel.add(ticketadd);
        maiPanel.add(singup);
        maiPanel.add(login);
        maiPanel.add(moviesView);
        PHome.setVisible(false);
        PProfile.setVisible(false);
        ticketadd.setVisible(false);
        singup.setVisible(false);
        login.setVisible(false);
        add(maiPanel);
        
        setVisible(true);
        // --------------------------------
    }
    public void reset(){
        remove(PHome);
        System.out.println("Done remove");
        
    }/* 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            //new Lobby();
            }
        });
    }*/

    public void PHome() {
    }
}
