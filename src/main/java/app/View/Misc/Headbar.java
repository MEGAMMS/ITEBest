package main.java.app.View.Misc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class Headbar extends JPanel {
    public Headbar() {
        initComponents();
    }

    private void initComponents() {
        JLabel title = new JLabel("ITEBest");
        JPanel PExit = new JPanel();
        JLabel Exitimh = ImageController.addPhoto("\\Exit.png", 40, 40);
        PExit.setBounds(1230, 0, 50, 50);
        PExit.add(Exitimh);
        PExit.setBackground(ColoringController.getFirstColorDark());
        title.setBounds(600, 0, 300, 50);
        this.setBounds(0, 0, 1280, 50);
        this.setLayout(null);
        this.setBackground(ColoringController.getFirstColorDark());
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        title.setForeground(Color.white);

        this.add(title);
        this.add(PExit);
        PanelsController.Exit(PExit);
    }
}
