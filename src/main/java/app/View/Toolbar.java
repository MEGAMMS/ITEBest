package main.java.app.View;

import java.io.IOException;
import javax.swing.JPanel;

import main.java.app.Controller.AnimatedPanel;
import main.java.app.Controller.ColoringController;

public class Toolbar extends JPanel {
    public Toolbar() throws IOException {
        initComponents();
    }

    private void initComponents() throws IOException {
        this.setBounds(0, 0, 60, 1000);
        this.setBackground(ColoringController.getFirstColorDark());
        this.setLayout(null);
        int hightOfButton = 130;
        int startY = 50;
        this.add(new AnimatedPanel("profile.png", "Profile", 0, startY, 60, hightOfButton));
        this.add(new AnimatedPanel("movie.png", "MoviesListView", 0, startY + hightOfButton, 60, hightOfButton));
        this.add(new AnimatedPanel("home.png", "Home", 0, startY + hightOfButton * 2, 60, hightOfButton));
        this.add(new AnimatedPanel("ticket.png", "TicketManager", 0, startY + hightOfButton * 3, 60, hightOfButton));
        this.add(new AnimatedPanel("setting.png", "", 0, startY + hightOfButton * 4, 60, hightOfButton));

        // -----------------------------
    }
}
