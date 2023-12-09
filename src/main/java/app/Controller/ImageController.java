package main.java.app.Controller;

import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageController {
    public static ImageIcon getITEBestIcon(){
        String imagePath = "src\\main\\resources\\images\\ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
    public static ImageIcon getbanar1Icon(){
        String imagePath = "src\\main\\resources\\images\\banaer.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(1180, 250, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
}
