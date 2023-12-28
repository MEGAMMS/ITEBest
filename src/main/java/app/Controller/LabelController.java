package main.java.app.Controller;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import com.kitfox.svg.Font;
import com.kitfox.svg.Style;

public class LabelController {
    public static JLabel addLabel(String text,java.awt.Font font){
        JLabel label=new JLabel(text);
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }
}
