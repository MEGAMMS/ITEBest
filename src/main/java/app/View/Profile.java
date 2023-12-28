package main.java.app.View;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.StyleConstants.ColorConstants;

import main.java.app.Controller.AnimatedPanel;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Model.Database;
import main.java.app.Model.User;

public class Profile extends JPanel {
    JPanel left,right;
    JLabel name,email,img,idCard,networth;
    public User user;
    Profile() {
        user=new User(0, "Name", "Email", "pass");
        initComponents();
    }
    public void updateData(User user){
        this.user=user;
        if(this.user.getvisa()==null)
            right.setVisible(false);
        name.setText("<html>" + user.getName()+"\r\n" + "</html>");
        email.setText("<html>" +"Email: "+ user.getEmail()+"\r\n" + "</html>");
    }
    private void initComponents() {
        left=new JPanel();
        left.setLayout(null);
        left.setBounds(10, 50, 590, 610);
        left.setBackground(ColoringController.getTowColor());
        img=ImageController.addPhoto("user.png", 150, 150);
        img.setBounds(10, 10, 150, 150);

        name=new JLabel("<html>" + user.getName()+"\r\n" + "</html>");
        name.setFont(FontController.getSecondryFont(Font.BOLD, 32));
        name.setBounds(170, 10, 400, 150);
        left.add(name);
        left.add(img);
        
        JLabel img2=ImageController.addPhoto("visacard.png", 400, 400);
        img2.setBounds(100, 10, 400, 400);
        right=new JPanel();
        right.setLayout(null);
        right.setBackground(ColoringController.getTowColor());
        right.add(img2);
        right.setBounds(610, 50, 590, 610);
        idCard=new JLabel("Id: "+"XXXX-XXXX-XXXX-XXXX");
        idCard.setFont(FontController.getSecondryFont(Font.BOLD, 32));
        idCard.setHorizontalAlignment(SwingConstants.CENTER);
        idCard.setBounds(0, 400, 590, 50);
        right.add(idCard);
        //add(right);
        email=new JLabel("<html>" +"Email: "+ user.getEmail()+"\r\n" + "</html>");
        email.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 28));
        email.setBounds(10, 200, 500, 60);
        add(new VisaCardAdd());
        left.add(email);
        add(left);
        setBounds(60, 50, 1220, 670);
        setLayout(null);
        JLabel TProfile = new JLabel("Profile Page");
        TProfile.setBounds(10,5,1200,40);
        TProfile.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        TProfile.setHorizontalAlignment(SwingConstants.CENTER);
        setBackground(ColoringController.getTowColorLigth());
        add(TProfile);
        this.setName("Profile");
    }

}
