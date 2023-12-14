package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Movie;

public class itemMove extends JPanel{
    static int hash=10;
    static int width=280;
    static int heigh=400;
    static int x=hash+5;
    static int y=hash;
    static int length=0;
    Movie movie;
    itemMove(){
        initComponents();
        PanelsController.Book(this);
        fix();
        length++;
    }
    private void initComponents(){
         //---------img-----------
            JPanel img=new JPanel();
            String[] posteStrings={"MoviesPosters//LADYBUG&CATNOIR.png","MoviesPosters//XIHOOGranTurismo.jpg"};
            JLabel poster=ImageController.addPhoto(posteStrings[length], 260, 320);
            img.setBackground(Color.BLACK);
            img.setBounds(10,10,260,320);
            img.setLayout(new BorderLayout());
            img.add(poster,BorderLayout.CENTER);
        //-----------------------
        JButton button=new JButton("Book");
        setLayout(null);
        button.setBounds(10,350, 260, 40);
        add(img);
        add(button);
        setBounds(x, y, width, heigh);
    }
    public void fix(){
        if(x+width+hash>1080){
            y+=heigh+hash;
            x=hash+5;
        }else{
            x+=width+hash;
        }
    }
    public static int sizePanel(){
        int size;
        if(length%4!=0){
            size=((length/4)+1)*(heigh+10);
        }else{
            size=((length/4))*(heigh+hash);
        }
        return size;
    }
}
