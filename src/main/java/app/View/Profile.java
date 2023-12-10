package main.java.app.View;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.app.Controller.FontController;

public class Profile extends JPanel {
    Profile() {
        initComponents();
    }

    private void initComponents() {

        setBounds(60, 50, 1220, 670);
        JLabel tHome = new JLabel("Profile Page");
        tHome.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        add(tHome);
        this.setName("Profile");
    }

}
