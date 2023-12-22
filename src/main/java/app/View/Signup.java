package main.java.app.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class Signup extends JPanel{
    JPanel left;
    JPanel right;
    JPanel info;
    JLabel name;
    JTextField Tname;
    JLabel email;
    JTextField Temail;
    JLabel pass;
    JPasswordField Tpass;
    JPanel Bsign;
    JPanel Bcansel;

    public Signup(){
        initComponents();
    }
    private void initComponents() {
        info=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 0)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        info.setOpaque(false);
        info.setBackground(Color.decode("#C9C9C9"));
        left=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 250)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        left.setOpaque(false);
        left.setBounds(10, 10, 690, 650);
        //left.setBackground(Color.decode("#F2F2F2"));
        left.setLayout(null);
        JLabel top=new JLabel("Sign Up"); 
        top.setBounds(10, 10, 670, 50);
        //top.setForeground(Color.BLACK);
        top.setFont(FontController.Roboto(Font.BOLD, 43));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        left.setBorder(PanelsController.roundedBorder(50));
        left.add(top);


        JPanel Pback=new JPanel();
        JLabel back=ImageController.addPhoto("\\backsign.jpg", 1220, 670);
        back.setBounds(0, 0, 1220, 670);
        Pback.setBounds(0, 0, 1220, 670);
        Pback.setLayout(null);
        Pback.add(back);


        name=new JLabel("Name:");
        name.setBounds(10, 100, 670, 30);
        //name.setForeground(Color.BLACK);
        name.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        left.add(name);
        Tname=new JTextField();
        Tname.setBounds(10, 140, 670, 50);
        Tname.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        left.add(Tname);

        email=new JLabel("Email:");
        email.setBounds(10, 200, 670, 30);
        //name.setForeground(Color.BLACK);
        email.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        left.add(email);
        Temail=new JTextField();
        Temail.setBounds(10, 240, 670, 50);
        Temail.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        left.add(Temail);

        pass=new JLabel("Password:");
        pass.setBounds(10, 300, 670, 30);
        //name.setForeground(Color.BLACK);
        pass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        left.add(pass);
        Tpass=new JPasswordField();
        Tpass.setBounds(10, 340, 670, 50);
        Tpass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        left.add(Tpass);

        Bsign=new JPanel();
        JPanel conBsign=new JPanel();
        JLabel Blabel=new JLabel("Sign up");

        Blabel.setForeground(ColoringController.getBasicColor());
        Blabel.setFont(FontController.Roboto(Font.BOLD, 22));
        conBsign.setBounds(5, 5, 240, 40);
        conBsign.setBackground(ColoringController.getWhiteColor());
        conBsign.add(Blabel);
        Bsign.setBounds(50, 580, 250, 50);
        Bsign.setBackground(ColoringController.getPrimaryColor());
        Bsign.setLayout(null);
        Bsign.add(conBsign);
        left.add(Bsign);

        Bcansel=new JPanel();
        JPanel conBcansel=new JPanel();
        JLabel BlabelC=new JLabel("Cansel");
        BlabelC.setForeground(ColoringController.getBasicColor());
        BlabelC.setFont(FontController.Roboto(Font.BOLD, 22));
        conBcansel.setBounds(5, 5, 240, 40);
        conBcansel.setBackground(ColoringController.getWhiteColor());
        conBcansel.add(BlabelC);
        Bcansel.setBounds(380, 580, 250, 50);
        Bcansel.setBackground(ColoringController.getPrimaryColor());
        Bcansel.setLayout(null);
        Bcansel.add(conBcansel);
        left.add(Bcansel);
        PanelsController.addToToolbar(Bcansel, "Close");


        right=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 100)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        right.setOpaque(false);
        right.setBounds(710, 10, 500, 650);
        //right.setBackground(Color.decode("#72223d"));
        right.setLayout(null);
        JLabel img1=ImageController.addPhoto("\\adduser3.png", 400, 400);
        img1.setBounds(50,150,400,400);
        right.add(img1);
        
        
        //info.setBackground(Color.decode("#FFFFFF"));
        info.setBounds(0, 0, 1220, 670);
        info.setLayout(null);
        
        setBackground(Color.WHITE);
        setBounds(60, 50, 1220, 670);
        setLayout(null);
        this.setName("Singup");
        
        
        info.add(left);
        info.add(right);
        
        add(info);
        add(Pback);
    }
}
