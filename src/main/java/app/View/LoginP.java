package main.java.app.View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.k33ptoo.components.KButton;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class LoginP extends JPanel {
    JPanel center;
    JPanel info;
    JLabel name;
    JTextField TName;
    JLabel email;
    JTextField TEmail;
    JLabel pass;
    JPasswordField TPass;
    KButton BSign;
    KButton BCansel;

    public LoginP() {
        initComponents();
    }

    private void initComponents() {

        info = new JPanel();

        center = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 200)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        center.setOpaque(false); // جعل اللوحة شفافة
        center.setBounds(200, 150, 800, 400);
        // center.setBackground(Color.decode("#C9C9C9"));
        center.setLayout(null);
        JLabel top = new JLabel("Login");
        top.setBounds(10, 10, 800, 50);
        top.setForeground(ColoringController.getBlackColor());
        top.setFont(FontController.Roboto(Font.BOLD, 43));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        center.setBorder(PanelsController.roundedBorder(50));
        center.add(top);
        JLabel back = ImageController.addPhoto("backlogin.jpg", 1220, 670);
        back.setBounds(0, 0, 1220, 670);
        /*
         * name=new JLabel("Name:");
         * name.setBounds(10, 100, 670, 30);
         * //name.setForeground(Color.BLACK);
         * name.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
         * left.add(name);
         * Tname=new JTextField();
         * Tname.setBounds(10, 140, 670, 50);
         * Tname.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
         * left.add(Tname);
         */

        email = new JLabel("Email:");
        email.setBounds(50, 100, 700, 30);
        // name.setForeground(Color.BLACK);
        email.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        center.add(email);
        TEmail = new JTextField();
        TEmail.setBounds(50, 140, 700, 50);
        TEmail.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        center.add(TEmail);

        pass = new JLabel("Password:");
        pass.setBounds(50, 200, 700, 30);
        // name.setForeground(Color.BLACK);
        pass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 24));
        center.add(pass);
        TPass = new JPasswordField();
        TPass.setBounds(50, 240, 700, 50);
        TPass.setFont(FontController.Roboto(Font.CENTER_BASELINE, 22));
        center.add(TPass);

        BSign = new KButton();
        BSign.setBounds(150, 330, 200, 50);
        BSign.setText("Login");
        BSign.setBackground(ColoringController.getPrimaryColor());
        PanelsController.setButtonN(BSign);
        center.add(BSign);

        BCansel = new KButton();
        BCansel.setText("Cansel");
        BCansel.setBounds(450, 330, 200, 50);
        PanelsController.setButtonN(BCansel);
        center.add(BCansel);
        // PanelsController.addToToolbar(Bcansel, "Close");

        /*
         * right=new JPanel();
         * right.setBounds(710, 10, 500, 650);
         * right.setBackground(Color.WHITE);
         * right.setLayout(null);
         * JLabel img1=ImageController.addPhoto("\\adduser3.png", 400, 400);
         * img1.setBounds(50,150,400,400);
         * right.add(img1);
         * 
         */
        info.setBackground(ColoringController.getWhiteColor());
        info.setBounds(0, 0, 1220, 670);
        info.setLayout(null);
        info.add(back);
        // back.setVisible(false);
        setBackground(ColoringController.getWhiteColor());
        setBounds(60, 50, 1220, 670);
        setLayout(null);
        this.setName("Singup");
        add(center);
        add(info);

    }
}
