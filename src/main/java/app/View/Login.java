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

public class Login extends JPanel {
    JPanel center;
    JPanel info;
    JLabel email;
    public JTextField TEmail;
    JLabel pass;
    public JPasswordField TPass;
    KButton BLogin;
    KButton BCancel;
    public JLabel EmailError,PassError,MsgError;
    public Login() {
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
        center.setLayout(null);
        JLabel top = new JLabel("Login");
        top.setBounds(10, 10, 800, 50);
        top.setForeground(ColoringController.getBlackColor());
        top.setFont(FontController.getSecondryFont(Font.BOLD, 43));
        top.setHorizontalAlignment(SwingConstants.CENTER);
        center.setBorder(PanelsController.roundedBorder(50));
        center.add(top);
        JLabel back = ImageController.addPhoto("backlogin.jpg", 1280, 670);
        back.setBounds(0, 0, 1280, 670);
    
        //--------Email
        email = new JLabel("Email:");
        email.setBounds(50, 60, 100, 30);
        email.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 24));
        center.add(email);
        TEmail = new JTextField();
        TEmail.setBounds(50, 100, 700, 50);
        TEmail.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        center.add(TEmail);
        EmailError = new JLabel("Please Enter Your Email" );
        EmailError.setBounds(125, 62, 200, 30);
        EmailError.setForeground(Color.decode("#B80000"));
        EmailError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        center.add(EmailError);
        //--------Password
        pass = new JLabel("Password:");
        pass.setBounds(50, 160, 200, 30);
        pass.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 24));
        center.add(pass);
        TPass = new JPasswordField();
        TPass.setBounds(50, 200, 700, 50);
        TPass.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        center.add(TPass);
        PassError = new JLabel("Please Enter Your Password" );
        PassError.setBounds(180, 162, 250, 30);
        PassError.setForeground(Color.decode("#B80000"));
        PassError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        center.add(PassError);
        MsgError = new JLabel("" );
        MsgError.setBounds(50, 250, 500, 30);
        MsgError.setForeground(Color.decode("#B80000"));
        MsgError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        center.add(MsgError);
        JLabel Signup = new JLabel("You don't hava an account? Sign up" );
        Signup.setBounds(50, 280, 400, 30);
        Signup.setForeground(ColoringController.getBasicColor());
        Signup.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 20));
        PanelsController.addActionToLabel(Signup, "Signup");
        center.add(Signup);

        BLogin = new KButton();
        BLogin.setBounds(150, 330, 200, 50);
        BLogin.setText("Login");
        BLogin.setBackground(ColoringController.getPrimaryColor());
        PanelsController.setButtonN(BLogin);
        PanelsController.addActionToKButton(BLogin, "Login");
        center.add(BLogin);

        BCancel = new KButton();
        BCancel.setText("Cancel");
        BCancel.setBounds(450, 330, 200, 50);
        PanelsController.setButtonN(BCancel);
        PanelsController.addActionToKButton(BCancel, "Cancel Login");
        center.add(BCancel);
        info.setBackground(ColoringController.getWhiteColor());
        info.setBounds(0, 0, 1280, 670);
        info.setLayout(null);
        info.add(back);
        setBackground(ColoringController.getWhiteColor());
        setBounds(0, 50, 1280, 670);
        setLayout(null);
        this.setName("Login");
        add(center);
        add(info);
        EmailError.setVisible(false);
        PassError.setVisible(false);

    }
}
