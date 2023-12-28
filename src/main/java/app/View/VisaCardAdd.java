package main.java.app.View;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.kitfox.svg.Font;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.LabelController;

public class VisaCardAdd extends JPanel{
    VisaCardAdd(){
        initComponents();
    }
    private void initComponents(){
        
        JLabel img2=ImageController.addPhoto("visacard.png", 400, 400);
        img2.setBounds(100, 10, 400, 400);
        setBounds(610, 50, 590, 610);
        setBackground(ColoringController.getTowColor());
        JLabel title=new JLabel("Add Visa Card");
       // title.setFont(FontController.getSecondryFont(Font.TAG_NAME, ABORT));
        add(img2);
    }
}
