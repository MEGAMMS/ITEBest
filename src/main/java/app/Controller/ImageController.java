package main.java.app.Controller;

import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageController {
    static String imagesPath = "src\\main\\resources\\images\\";
    public static ImageIcon getITEBestIcon(){
        String imagePath = imagesPath + "ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
    public static ImageIcon getBanar1Icon(){
        String imagePath =  imagesPath + "banaer.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(1180, 250, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
}
