package main.java.app.Controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import main.java.app.ITEBest;

import java.awt.Image;

class tmp {
    java.net.URL StringToURl(String path) {
        return this.getClass().getResource(path);
    }
}

public class ImageController {
    static String imagesPath = "..\\..\\resources\\images\\";

    static java.net.URL StringToURl(String path) {
        java.net.URL url = ITEBest.class.getResource(path);
        System.out.println(url);
        return url;
    }

    public static ImageIcon getITEBestIcon(int width, int height) {
        String imagePath = imagesPath + "ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }

    public static ImageIcon getITEBestIcon() {
        String imagePath = imagesPath + "ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        return imageIcon;
    }

    public static ImageIcon getBanar1Icon() {
        String imagePath = imagesPath + "banaer.png";
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(1180, 250, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }

    public static ImageIcon getIcon(String name) {
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }

    public static ImageIcon getIcon(String name, int width, int height) {
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }

    public static JLabel addPhoto(String name) {
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        return imageLabel;
    }

    public static JLabel addPhotoBasic(String name) {
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        JLabel imageLabel = new JLabel(imageIcon);
        return imageLabel;
    }

    public static JLabel addPhoto(String name, int WIDTH, int HEIGHT) {
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(StringToURl(imagePath));
        Image resizedImage = imageIcon.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        return imageLabel;
    }
}
