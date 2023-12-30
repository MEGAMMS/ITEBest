package main.java.app.View;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import com.k33ptoo.components.KButton;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.LabelController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.User;

public class Profile extends JPanel {
    public JPanel left, right, dontPayM;
    public VisaCardAdd addVisaCard;
    JLabel name, email, img, idCard, networth, password;

    public User user;

    Profile() {
        user = new User(0, "Name", "Email", "pass");
        initComponents();
    }

    public void updateData(User user) {
        this.user = user;
        if (user.creditcard == null) {
            right.setVisible(false);
            dontPayM.setVisible(true);
        } else {
            right.setVisible(true);
            dontPayM.setVisible(false);
            idCard.setText("Id: " + user.creditcard.getID());
            networth.setText("networth: " + user.creditcard.getNetworth() + " S.P");
        }

        name.setText("<html>" + this.user.getName() + "\r\n" + "</html>");
        email.setText("<html>" + "Email: " + this.user.getEmail() + "\r\n" + "</html>");
        password.setText("<html>" + "Password: " + this.user.getPassword() + "\r\n" + "</html>");

    }

    private void initComponents() {
        left = new JPanel();
        left.setLayout(null);
        left.setBounds(10, 50, 590, 610);
        left.setBackground(ColoringController.getSecoundColorLight());
        img = ImageController.addPhoto("user.png", 150, 150);
        img.setBounds(10, 10, 150, 150);

        name = new JLabel("<html>" + user.getName() + "\r\n" + "</html>");
        name.setFont(FontController.getSecondryFont(Font.BOLD, 32));
        name.setBounds(170, 10, 400, 150);
        name.setForeground(ColoringController.getBlackColor());
        left.add(name);
        left.add(img);
        email = new JLabel("<html>" + "Email: " + user.getEmail() + "\r\n" + "</html>");
        email.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 28));
        email.setBounds(10, 200, 500, 60);
        email.setForeground(ColoringController.getBlackColor());
        left.add(email);
        password = new JLabel("<html>" + "Password: " + user.getPassword() + "\r\n" + "</html>");
        password.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 28));
        password.setBounds(10, 300, 500, 60);
        password.setForeground(ColoringController.getBlackColor());
        left.add(password);
        KButton loguot = new KButton();
        PanelsController.setKButtonlight(loguot, ColoringController.getSecoundColorDark1());
        PanelsController.addActionToKButton(loguot, "Log out");
        loguot.setBounds(10, 540, 200, 50);
        loguot.setLayout(null);
        JLabel imgLogout = ImageController.addPhoto("logout.png");
        imgLogout.setBounds(10, 5, 40, 40);
        JLabel labelLogout = LabelController.addLabel("Log out", FontController.getSecondryFont(Font.BOLD, 22));
        labelLogout.setBounds(60, 5, 100, 40);
        loguot.add(labelLogout);
        loguot.add(imgLogout);
        left.add(loguot);

        JLabel img2 = ImageController.addPhoto("visacard.png", 400, 400);
        img2.setBounds(100, 10, 400, 400);
        right = new JPanel();
        right.setLayout(null);
        right.setBackground(ColoringController.getSecoundColorLight());
        right.add(img2);
        right.setBounds(610, 50, 590, 610);
        idCard = new JLabel("Id: " + "XXXX-XXXX-XXXX-XXXX");
        idCard.setFont(FontController.getSecondryFont(Font.BOLD, 32));
        idCard.setHorizontalAlignment(SwingConstants.CENTER);
        idCard.setForeground(ColoringController.getBlackColor());
        idCard.setBounds(0, 400, 590, 50);
        right.add(idCard);

        networth = new JLabel("networth: " + "0 S.P");
        networth.setFont(FontController.getSecondryFont(Font.BOLD, 32));
        networth.setHorizontalAlignment(SwingConstants.CENTER);
        networth.setForeground(ColoringController.getBlackColor());
        networth.setBounds(0, 480, 590, 50);
        right.add(networth);

        addVisaCard = new VisaCardAdd();
        add(addVisaCard);
        add(right);
        right.setVisible(false);
        dontPayM = new JPanel();
        dontPayM.setLayout(null);
        dontPayM.setBackground(ColoringController.getSecoundColor());
        dontPayM.setBounds(610, 50, 590, 610);
        JLabel imgdontCard = ImageController.addPhoto("DontpayM.png", 600, 400);
        imgdontCard.setBounds(0, 60, 600, 400);
        dontPayM.add(imgdontCard);
        KButton paddVisaCard = new KButton();
        paddVisaCard.setText("Add Visa Card");
        paddVisaCard.setBounds(180, 540, 300, 40);
        PanelsController.setKButtonlight(paddVisaCard, ColoringController.getFirstColorDark());
        PanelsController.addActionToKButton(paddVisaCard, "AddVisaCard");
        dontPayM.add(paddVisaCard);
        add(dontPayM);
        addVisaCard.setVisible(false);
        add(left);
        setBounds(60, 50, 1220, 670);
        setLayout(null);
        JLabel TProfile = new JLabel("Profile Page");
        TProfile.setBounds(10, 5, 1200, 40);
        TProfile.setForeground(ColoringController.getBlackColor());
        TProfile.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        TProfile.setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(ColoringController.getSecoundColor());
        add(TProfile);
        this.setName("Profile");
    }

}
