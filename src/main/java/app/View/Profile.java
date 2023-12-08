package main.java.app.View;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile extends JPanel{
    Profile(){
        initComponents();
    }
    private void initComponents(){
        Font f30 = new Font("Arial", Font.BOLD, 30);
        setBounds(60,50,1220,670);
        JLabel tHome=new JLabel("Profile Page");
        tHome.setFont(f30);
        add(tHome);
    }
    
}
