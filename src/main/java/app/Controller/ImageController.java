package main.java.app.Controller;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Image;

public class ImageController {
    static String imagesPath = "src\\main\\resources\\images\\";
    public static ImageIcon getITEBestIcon(int width,int height){
        String imagePath = imagesPath + "ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
    public static ImageIcon getITEBestIcon(){
        String imagePath = imagesPath + "ITEBestIcon.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        return imageIcon;
    }
    public static ImageIcon getBanar1Icon(){
        String imagePath =  imagesPath + "banaer.png";
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(1180, 250, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
    public static ImageIcon getIcon(String name){
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        return resizedImageIcon;
    }
    public static JLabel addPhoto(String name){
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        return imageLabel;
    }
    public static JLabel addPhotoBasic(String name){
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(imagePath);
        JLabel imageLabel = new JLabel(imageIcon);
        return imageLabel;
    }
    public static JLabel addPhoto(String name,int WIDTH,int HEIGHT){
        String imagePath = imagesPath + name;
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(WIDTH, HEIGHT, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        return imageLabel;
    }
}
