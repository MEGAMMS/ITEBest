package main.java.app.View;

import main.java.app.Controller.ImageController;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Start extends JFrame {
    Start() {
        initComponents();
    }

    private void initComponents() {
        // ----------Left-------------
        JPanel left = new JPanel();
        JLabel imageLabel = new JLabel(ImageController.getITEBestIcon());
        left.setBounds(0, 0, 500, 400);
        left.setLayout(new BorderLayout());
        left.setBackground(ColoringController.getFirstColor());
        left.add(imageLabel, BorderLayout.CENTER);
        // ---------------------------

        // ---------Rigth-------------
        JPanel rigth = new JPanel();
        JLabel welcomelLabel = new JLabel("Welcome");
        rigth.setBounds(500, 0, 200, 400);
        welcomelLabel.setFont(FontController.getPrimaryFont(Font.BOLD, 20));
        rigth.add(welcomelLabel);
        // ---------------------------

        // -------Propeties-----------
        setSize(700, 400);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        add(rigth);
        add(left);
        setVisible(true);
        // ---------------------------
    }

    public static void main() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Start();
            }
        });
    }
}
