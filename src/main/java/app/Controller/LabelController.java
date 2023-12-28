package main.java.app.Controller;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.kitfox.svg.Style;


public class LabelController {
    public static JLabel addLabel(String text,Font font){
        JLabel label=new JLabel(text);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
}
