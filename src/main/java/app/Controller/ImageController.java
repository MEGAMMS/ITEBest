package main.java.app.Controller;

import javax.swing.ImageIcon;
import java.awt.Image;

public class ImageController {
    public ImageIcon getITEBestIcon(){
        String imagePath = "src\\main\\resources\\images\\ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
}
