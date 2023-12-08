package main.java.app.View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel{
    Home(){
        initComponents();
    }
    private void initComponents(){
        Font f30 = new Font("Arial", Font.BOLD, 30);
        JPanel baner = new JPanel();
        baner.setBackground(Color.LIGHT_GRAY);
        
    
        setBounds(60, 50, 1220, 670);
        JLabel tHome = new JLabel("Home Page");
        tHome.setBounds(10, 0, 300, 50);
        baner.setBounds(10, 50, 1200, 250);
        tHome.setFont(f30);
        setLayout(null);
        add(tHome);
        add(baner);
        
    }
    public JPanel getP(){
        return this;
    }
}
