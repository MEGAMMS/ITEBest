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
        // AnimatedPanel profile=new AnimatedPanel("profile.png","Profile",0, 70, 60, 100);
        // this.add(profile);
        this.add(new AnimatedPanel("movie.png","MoviesListView",0, 170, 60, 100));
        // this.add(new AnimatedPanel("fire.png","",0, 270, 60, 100));
        // this.add(new AnimatedPanel("home.png","Home",0, 370, 60, 100));
        // this.add(new AnimatedPanel("ticket.png","",0, 470, 60, 100));
        // this.add(new AnimatedPanel("setting.png","",0, 570, 60, 100));

        // -----------------------------
    }
}
