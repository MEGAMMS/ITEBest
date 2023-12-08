package main.java.app.View;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.ColoringController;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Start extends JFrame{
    Start(){
        initComponents();
    }
    private void initComponents(){
        Font f20 = new Font("Arial", Font.BOLD, 20);
        JPanel left=new JPanel();
        JPanel rigth=new JPanel();

        
        JLabel welcomelLabel=new JLabel("Welcome");
        JLabel imageLabel = new JLabel(ImageController.getITEBestIcon());
        
        // إضافة الصورة إلى النافذة
        rigth.setBounds(500, 0, 200, 400);
        left.setBounds(0, 0, 500, 400);
        left.setLayout(new BorderLayout());
        left.setBackground(ColoringController.getPrimaryColor());
        setSize(700,400);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        welcomelLabel.setFont(f20);
        rigth.add(welcomelLabel);
        left.add(imageLabel,BorderLayout.CENTER);
        add(rigth);
        add(left);
        setVisible(true);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Start();
            }
        });
    }
}
