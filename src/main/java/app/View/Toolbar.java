package main.java.app.View;

import java.awt.BorderLayout;
import java.io.IOException;

import javax.swing.JPanel;

import main.java.app.Controller.AnimatedPanel;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class Toolbar extends JPanel {
    public Toolbar() throws IOException{
        initComponents();
    }
    private void initComponents() throws IOException {
    this.setBounds(0, 0, 60, 1000);
        this.setBackground(ColoringController.getBasicColor());
        this.setLayout(null);
        //
        JPanel BProfile = new JPanel();
        BProfile.setName("BProfile");
        BProfile.setLayout(new BorderLayout());
        BProfile.setBounds(0, 70, 60, 100);
        BProfile.add(ImageController.addPhoto("profile.png"), BorderLayout.CENTER);
        BProfile.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(BProfile, "Profile");
        this.add(BProfile);
        //
        JPanel BMoviesList = new JPanel();
        BMoviesList.setLayout(new BorderLayout());
        BMoviesList.setBounds(0, 170, 60, 100);
        BMoviesList.add(ImageController.addPhoto("movie.png"), BorderLayout.CENTER);
        BMoviesList.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(BMoviesList, "MoviesListView");
        this.add(new AnimatedPanel("movie.png","MoviesListView",0, 170, 60, 100));
        //
        JPanel BTrend = new JPanel();
        BTrend.setLayout(new BorderLayout());
        BTrend.setBounds(0, 270, 60, 100);
        BTrend.add(ImageController.addPhoto("fire.png"), BorderLayout.CENTER);
        BTrend.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(BTrend, "");
        this.add(BTrend);
        //
        JPanel BHome = new JPanel();
        BHome.setName("BHome");
        BHome.setLayout(new BorderLayout());
        BHome.setBounds(0, 370, 60, 100);
        BHome.add(ImageController.addPhoto("home.png"), BorderLayout.CENTER);
        //BHome.add(ImageController.addPhotoBasic("home.png"));
        BHome.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(BHome, "Home");
        this.add(BHome);
        //
        JPanel Bticket = new JPanel();
        Bticket.setLayout(new BorderLayout());
        Bticket.setBounds(0, 470, 60, 100);
        Bticket.add(ImageController.addPhoto("ticket.png"), BorderLayout.CENTER);
        Bticket.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(Bticket, "");
        this.add(Bticket);
        //
        JPanel BSettings = new JPanel();
        BSettings.setLayout(new BorderLayout());
        BSettings.setBounds(0, 570, 60, 100);
        BSettings.add(ImageController.addPhoto("setting.png"), BorderLayout.CENTER);
        BSettings.setBackground(ColoringController.getBasicColor());
        PanelsController.addActionToButton(BSettings, "");
        this.add(BSettings);
        //
        // -----------------------------
    }
}
