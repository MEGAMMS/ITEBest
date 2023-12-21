package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Movie;

public class itemMove extends JPanel{
    String tag;
    static int hash=10;
    static int width=280;
    static int heigh=430;
    static int x=hash+5;
    static int y=hash;
    static int length=0;
    public Movie movie;
    
    public static void restSize(){
        hash=10;
        width=280;
        heigh=400;
        x=hash+5;
        y=hash;
        length=0;
    }
    public itemMove(Movie movie){
        this.movie=movie;
        initComponents();
        fix();
        length++;

    }
    private void initComponents(){
         //---------img-----------
            JPanel img=new JPanel();
            JLabel poster=ImageController.addPhoto(movie.getPoster(), 260, 320);
            img.setBackground(Color.BLACK);
            img.setBounds(10,10,260,320);
            img.setLayout(new BorderLayout());
            img.add(poster,BorderLayout.CENTER);


        JLabel titel = new JLabel(movie.getTitle());
        titel.setHorizontalAlignment(SwingConstants.CENTER);
        titel.setBounds(10, 330, 260, 50);
        titel.setFont(FontController.Roboto(Font.BOLD, 16));
        //-----------------------
        JPanel button=new JPanel();
        JLabel Btitel = new JLabel("See More");
        Btitel.setHorizontalAlignment(SwingConstants.CENTER);
        Btitel.setBounds(0, 0, 260, 40);
        Btitel.setFont(FontController.getPrimaryFont(Font.BOLD, 18));
        button.setBackground(Color.white);
        button.setBounds(10,380, 260, 40);
        button.setLayout(null);
        button.add(Btitel);
        button.setBorder(new LineBorder(ColoringController.getPrimaryColor(), 2,true));
        //button.setBorder(roundedBorder);
        PanelsController.Book(this,button,Btitel,movie);
        //setBorder(new LineBorder(Color.BLACK, 1));
        setLayout(null);
        setBounds(x, y, width, heigh);
        
        setBorder(PanelsController.roundedBorder(30));
        button.setBorder(PanelsController.roundedBorder(20));
        setBackground(Color.decode("#F2F2F2"));
        add(img);
        add(titel);
        add(button);
        
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
