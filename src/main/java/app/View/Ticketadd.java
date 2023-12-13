package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;

public class Ticketadd extends JFrame{

    String titleMove="LADYBUG & CAT NOIR";
    String descriptionMove="Wanneer een onverwachte schurk Parijs in gevaar brengt met zwarte magie, verandert de onhandige tiener Marinette in superheld Ladybug. Op zoek naar balans tussen haar nieuwe krachten en school, bundelt ze haar krachten met de charmante Cat Noir.";
    String posterPath="MoviesPosters//LADYBUG&CATNOIR.png";
    Ticketadd(){
        initComponents();
    }
    private void initComponents(){
        
    //-----------TOP-------------
        JPanel top=new JPanel();
        top.setBackground(ColoringController.getBasicColor());
        top.setBounds(0,0,800,40);
        JLabel title = new JLabel("Add Ticket");
        title.setBounds(350, 0, 300, 50);
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 24));
        title.setForeground(ColoringController.getWhiteColor());
        top.add(title);
    //---------------------------
    //-----------Body------------
        JPanel body=new JPanel();
        //body.setBackground(ColoringController.getLightGrayColor());
        body.setBounds(0,40,800,540);
        body.setLayout(null);
        //---------img-----------
            JPanel img=new JPanel();
            JLabel poster=ImageController.addPhoto(this.posterPath, 310, 520);
            img.setBackground(Color.BLACK);
            img.setBounds(480,10,310,520);
            img.setLayout(new BorderLayout());
            img.add(poster,BorderLayout.CENTER);
        //-----------------------
        //-------titleP---0------
            JPanel titleP=new JPanel();
            JLabel titleM=new JLabel(this.titleMove);
            titleM.setForeground(Color.BLACK);
            titleM.setHorizontalAlignment(SwingConstants.CENTER);
            titleM.setFont(FontController.getPrimaryFont(ABORT, 24));
            titleP.setBounds(10,10,460,50);
            titleP.setBackground(ColoringController.getLightGrayColor());
            titleP.setLayout(new BorderLayout());
            titleP.add(titleM,BorderLayout.CENTER);
        //-----------------------
        //---------Des---------
            JPanel descP=new JPanel();
            JLabel description=new JLabel("Description");
            JLabel descM=new JLabel("<html>"+this.descriptionMove+"\r\n" + //
                    "\r\n" + //
                    "</html>");
            //descM.setPreferredSize(new Dimension(380, 200));
            descM.setBounds(10, 0, 450, 190);
            descM.setForeground(Color.BLACK);
            //descM.setHorizontalAlignment(SwingConstants.CENTER);
            descM.setFont(FontController.getPrimaryFont(ABORT, 18));
            //description.setPreferredSize(new Dimension(380, 40));
            description.setBounds(10, 0, 380, 40);
            description.setForeground(Color.BLACK);
            //description.setHorizontalAlignment(SwingConstants.CENTER);
            description.setFont(FontController.getPrimaryFont(Font.BOLD, 18));
            descP.setBounds(10,70,460,170);
            descP.setBackground(ColoringController.getLightGrayColor());
            descP.setLayout(null);
            descP.add(description);
            descP.add(descM);
        //-----------------------
        //---------Booking---------
            JPanel bookingP=new JPanel();
            //JLabel descM=new JLabel("XIHOO Gran Turismo");
            //descM.setForeground(Color.BLACK);
            //descM.setHorizontalAlignment(SwingConstants.CENTER);
            //titleM.setFont(FontController.getPrimaryFont(ABORT, 24));
            bookingP.setBounds(10,250,460,230);
            bookingP.setBackground(ColoringController.getLightGrayColor());
            bookingP.setLayout(new BorderLayout());
            
        //-----------------------
            //---------Buttons---------
            JPanel addTick=new JPanel();
            JLabel bttickT=new JLabel("Add");
            bttickT.setForeground(Color.WHITE);
            bttickT.setHorizontalAlignment(SwingConstants.CENTER);
            bttickT.setFont(FontController.getPrimaryFont(ABORT, 24));
            addTick.setBounds(20,490,200,40);
            addTick.setBackground(ColoringController.getBasicColor());
            addTick.setLayout(new BorderLayout());
            addTick.add(bttickT);
            // EventController.lightButton(addTick);

            JPanel closeP=new JPanel();
            JLabel closeT=new JLabel("Close");
            closeT.setForeground(Color.WHITE);
            closeT.setHorizontalAlignment(SwingConstants.CENTER);
            closeT.setFont(FontController.getPrimaryFont(ABORT, 24));
            closeP.setBounds(260,490,200,40);
            closeP.setBackground(ColoringController.getBasicColor());
            closeP.setLayout(new BorderLayout());
            closeP.add(closeT);
            // EventController.lightButton(closeP);
        //-----------------------
        body.add(img);
        body.add(titleP);
        body.add(descP);
        body.add(bookingP);
        body.add(addTick);
        body.add(closeP);
    //---------------------------
    //----------Buttom-----------
        JPanel buttom=new JPanel();
        buttom.setBackground(ColoringController.getBasicColor());
        buttom.setBounds(0,580,800,20);
        
    //---------------------------
    //-------Properites----------
        setIconImage(new ImageIcon("src\\main\\resources\\images\\ITEBestIcon.png").getImage());
        setSize(800, 600);
        setUndecorated(true);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        add(top);
        add(body);
        add(buttom);
    //---------------------------
    }
}
