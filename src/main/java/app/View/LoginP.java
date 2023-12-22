package main.java.app.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.k33ptoo.components.KButton;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class LoginP extends JPanel{
    JPanel center;
    JPanel info;
    JLabel name;
    JTextField Tname;
    JLabel email;
    JTextField Temail;
    JLabel pass;
    JPasswordField Tpass;
    KButton Bsign;
    KButton Bcansel;

    public LoginP(){
        initComponents();
    }
    private void initComponents() {
        
        info=new JPanel();
        
        center=new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 200)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        center.setOpaque(false); // جعل اللوحة شفافة
        center.setBounds(200, 150, 800, 400);
        center.setBackground(Color.decode("#C9C9C9"));
        center.setLayout(null);
        JLabel top=new JLabel("Login"); 
        top.setBounds(10, 10, 800, 50);
        top.setForeground(Color.BLACK);
        top.setFont(FontController.Roboto(Font.BOLD, 43));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        center.setBorder(PanelsController.roundedBorder(50));
        center.add(top);
        JLabel back=ImageController.addPhoto("\\backlogin.jpg", 1220, 670);
        back.setBounds(0, 0, 1220, 670);
        /* 
        name=new JLabel("Name:");
        name.setBounds(10, 100, 670, 30);
        //name.setForeground(Color.BLACK);
        name.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        left.add(name);
        Tname=new JTextField();
        Tname.setBounds(10, 140, 670, 50);
        Tname.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        left.add(Tname);*/

        email=new JLabel("Email:");
        email.setBounds(50, 100, 700, 30);
        //name.setForeground(Color.BLACK);
        email.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        center.add(email);
        Temail=new JTextField();
        Temail.setBounds(50, 140, 700, 50);
        Temail.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        center.add(Temail);

        pass=new JLabel("Password:");
        pass.setBounds(50, 200, 700, 30);
        //name.setForeground(Color.BLACK);
        pass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        center.add(pass);
        Tpass=new JPasswordField();
        Tpass.setBounds(50, 240, 700, 50);
        Tpass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        center.add(Tpass);

        Bsign=new KButton();
        Bsign.setBounds(150, 330, 200, 50);
        Bsign.setText("Login");
        Bsign.setBackground(ColoringController.getPrimaryColor());
        PanelsController.setButtonN(Bsign);
        center.add(Bsign);
        

        Bcansel=new KButton();
        Bcansel.setText("Cansel");
        Bcansel.setBounds(450, 330, 200, 50);
        PanelsController.setButtonN(Bcansel);
        center.add(Bcansel);
        //PanelsController.addToToolbar(Bcansel, "Close");

/* 
        right=new JPanel();
        right.setBounds(710, 10, 500, 650);
        right.setBackground(Color.WHITE);
        right.setLayout(null);
        JLabel img1=ImageController.addPhoto("\\adduser3.png", 400, 400);
        img1.setBounds(50,150,400,400);
        right.add(img1);
        
        */
        info.setBackground(Color.WHITE);
        info.setBounds(0, 0, 1220, 670);
        info.setLayout(null);
        info.add(back);
        //back.setVisible(false);
        setBackground(Color.WHITE);
        setBounds(60, 50, 1220, 670);
        setLayout(null);
        this.setName("Singup");
        add(center);
        add(info);
        
    }
}
