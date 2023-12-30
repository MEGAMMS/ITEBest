package main.java.app.Controller;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



public class LabelController {
    public static JLabel addLabel(String text,Font font){
        JLabel label=new JLabel(text);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBorder(new EmptyBorder(0,0,0,0));
        return label;
    }
    public static JLabel addLabel(String text,Font font,int X,int Y,int width,int height){
        JLabel label=new JLabel(text);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBounds(X, Y, width, height);
        label.setBorder(new EmptyBorder(0,0,0,0));
        return label;
    }
}
