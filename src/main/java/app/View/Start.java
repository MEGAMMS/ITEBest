package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
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

        String imagePath = "D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel welcomelLabel=new JLabel("Welcome");
        JLabel imageLabel = new JLabel(resizedImageIcon);
        
        // إضافة الصورة إلى النافذة
        rigth.setBounds(500, 0, 200, 400);
        left.setBounds(0, 0, 500, 400);
        left.setLayout(new BorderLayout());
        left.setBackground(Color.decode("#AF2655"));
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
