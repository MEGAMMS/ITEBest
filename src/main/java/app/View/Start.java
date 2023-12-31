package main.java.app.View;

import main.java.app.Controller.ImageController;
import main.java.app.Controller.Utils;
import main.java.app.Model.Database;
import main.java.app.Model.Spinner;
import main.java.app.ITEBest;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.DefaultDatabase;
import main.java.app.Controller.FontController;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Start extends JFrame {
    public static MainFrame mainFrame;
    public JLabel loadingJLabel; 
    Spinner spinner,spinner2;
    Timer timer;
    private static int angle = 0;
    public Start() {
        
        initComponents();
        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                spinner.rotate();
                spinner.repaint();
            }
        });
        timer.start();

    }

    private void initComponents() {
        
        // ----------Left-------------
        JPanel left = new JPanel();
        JLabel imageLabel = new JLabel(ImageController.getIcon("ITEBestIcon.png", 300, 300));
        left.setBounds(0, 0, 500, 400);
        left.setLayout(new BorderLayout());
        left.setBackground(ColoringController.getFirstColor());
        left.add(imageLabel, BorderLayout.CENTER);
        // ---------------------------

        // ---------Rigth-------------
        
        JPanel rigth = new JPanel();
        rigth.setLayout(null);
        JLabel welcomelLabel = new JLabel("Welcome");
        welcomelLabel.setForeground(ColoringController.getBlackColor());
        welcomelLabel.setBounds(0, 10, 200, 100);
        welcomelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rigth.setBounds(500, 0, 200, 400);
        welcomelLabel.setFont(FontController.getPrimaryFont(Font.BOLD, 22));
        rigth.add(welcomelLabel);

        loadingJLabel = new JLabel("Loading ...");
        loadingJLabel.setForeground(ColoringController.getBlackColor());
        loadingJLabel.setBounds(0, 230, 200, 50);
        loadingJLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loadingJLabel.setFont(FontController.getPrimaryFont(Font.BOLD, 22));
        rigth.add(loadingJLabel);
        spinner=new Spinner(ColoringController.getFirstColorDark());
        spinner.setBounds(50, 280, 100, 100);
        rigth.add(spinner);
        // ---------------------------

        // -------Propeties-----------
        
        setIconImage(ImageController.getITEBestIcon().getImage());
        setSize(700, 400);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
        add(rigth);
        add(left);
        setVisible(true);
        // ---------------------------
    }


    public static void showLoadingFrame() {
        SwingUtilities.invokeLater(() -> {
            ITEBest.startLoading=new Start();
        });
    }

    public static  void hideLoadingScreen() {
        SwingUtilities.invokeLater(() -> {
            if (ITEBest.startLoading != null) {
                ITEBest.startLoading.dispose();
            }
        });
    }
}

