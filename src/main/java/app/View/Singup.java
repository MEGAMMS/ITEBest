package main.java.app.View;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.app.Controller.FontController;

public class Singup extends JPanel{
    JPanel left;
    JPanel right;
    JPanel info;

    public Singup(){
        initComponents();
    }
    private void initComponents() {
        left=new JPanel();
        left.setBounds(10, 10, 400, 650);
        left.setBackground(Color.BLACK);



        setBounds(60, 50, 1220, 670);
        this.setName("Singup");
        add(left);
    }
}
