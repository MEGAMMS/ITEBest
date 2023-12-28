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
import com.k33ptoo.components.KGradientPanel;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;

public class Signup extends JPanel {
    JPanel left;
    KGradientPanel right;
    JPanel info;
    JLabel name;
    public JTextField Tname;
    JLabel email;
    public JTextField Temail;
    JLabel pass;
    public JPasswordField Tpass;
    KButton Bsign;
    KButton BCancel;
    public JLabel NameError,EmailError,PassError,MsgError;

    public Signup() {
        initComponents();
    }

    private void initComponents() {
        info = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(new Color(255, 255, 255, 0)); // تعيين لون خلفية مع شفافية
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        info.setOpaque(false);
        info.setBackground(Color.decode("#C9C9C9"));
        left = new JPanel();
        left.setBounds(0, 0, 730, 650);
        left.setBackground(Color.decode("#EEEEEE"));
        left.setLayout(null);
        JLabel top = new JLabel("Sign Up");
        top.setBounds(10, 10, 670, 50);
        // top.setForeground(Color.BLACK);
        top.setFont(FontController.getSecondryFont(Font.BOLD, 43));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        //left.setBorder(PanelsController.roundedBorder(50));
        left.add(top);

        JPanel Pback = new JPanel();
        JLabel back = ImageController.addPhoto("\\backsign.jpg", 1280, 670);
        back.setBounds(0, 0, 1280, 670);
        Pback.setBounds(0, 0, 1280, 670);
        Pback.setLayout(null);
        Pback.add(back);

        name = new JLabel("Name:");
        name.setBounds(10, 100, 80, 30);
        NameError = new JLabel("Please Enter Your Name" );
        NameError.setBounds(90, 102, 200, 30);
        NameError.setForeground(ColoringController.getRedColor());
        NameError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        // name.setForeground(Color.BLACK);
        name.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 24));
        left.add(name);
        left.add(NameError);
        Tname = new JTextField();
        Tname.setBounds(10, 140, 670, 50);
        Tname.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        left.add(Tname);

        email = new JLabel("Email:");
        email.setBounds(10, 200, 80, 30);
        email.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 24));
        EmailError = new JLabel("Please Enter Your Email" );
        EmailError.setBounds(90, 202, 200, 30);
        EmailError.setForeground(ColoringController.getRedColor());
        EmailError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        left.add(email);
        left.add(EmailError);
        Temail = new JTextField();
        Temail.setBounds(10, 240, 670, 50);
        Temail.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        left.add(Temail);

        pass = new JLabel("Password:");
        pass.setBounds(10, 300, 150, 30);
        pass.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 24));
        PassError = new JLabel("Please Enter Your Password" );
        PassError.setBounds(130, 302, 300, 30);
        PassError.setForeground(ColoringController.getRedColor());
        PassError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        left.add(pass);
        left.add(PassError);
        Tpass = new JPasswordField();
        Tpass.setBounds(10, 340, 670, 50);
        Tpass.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        left.add(Tpass);
        MsgError = new JLabel("" );
        MsgError.setBounds(10, 400, 300, 30);
        MsgError.setForeground(ColoringController.getRedColor());
        MsgError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        left.add(MsgError);

        JLabel Login = new JLabel("You have an account? Login" );
        Login.setBounds(10, 440, 300, 30);
        Login.setForeground(ColoringController.getBasicColor());
        Login.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 20));
        PanelsController.addActionToLabel(Login, "Login");
        left.add(Login);

        Bsign = new KButton();
        Bsign.setBounds(50, 580, 200, 50);
        Bsign.setText("Sign Up");
        Bsign.setBackground(ColoringController.getPrimaryColor());
        PanelsController.setButtonN(Bsign);
        PanelsController.addActionToKButton(Bsign, "Sign Up");
        BCancel = new KButton();
        BCancel.setText("Cancel");
        BCancel.setBounds(450, 580, 200, 50);
        PanelsController.setButtonN(BCancel);
        PanelsController.addActionToKButton(BCancel, "Cancel Signup");
        left.add(Bsign);

        left.add(BCancel);
        right = new KGradientPanel();
        right.setkEndColor(Color.decode("#860A35"));
        right.setkStartColor(Color.decode("#D30A35"));
        right.setBounds(710, 0, 570, 650);
        right.setLayout(null);
        JLabel img1 = ImageController.addPhoto("\\ITEBestIcon.png", 400, 400);
        img1.setBounds(100, 130, 400, 400);
        right.add(img1);
        info.setBounds(0, 0, 1280, 670);
        info.setLayout(null);

        NameError.setVisible(false);
        EmailError.setVisible(false);
        PassError.setVisible(false);
        setBackground(Color.WHITE);
        setBounds(0, 50, 1280, 670);
        setLayout(null);
        this.setName("Singup");
        
        info.add(left);
        info.add(right);
        
        add(info);
        add(Pback);
    }
}
