package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class TicketAdd extends JPanel {

    Movie movie;
    JPanel descP = new JPanel();
    public JLabel titleM;
    public JLabel descM;
    public JLabel poster;

    public void updateData(int id) {
        this.movie = Database.movies.get(id);
        this.titleM.setText(movie.getTitle());
        JLabel label = ImageController.addPhoto(movie.getPoster(), 400, 600);
        this.poster.setIcon(label.getIcon());
        this.descM.setText("<html>" + this.movie.getDescription() + "\r\n" + //
                "\r\n" + //
                "</html>");

    }

    public TicketAdd() {
        movie = Database.movies.get(0);
        titleM = new JLabel();
        descM = new JLabel();
        poster = ImageController.addPhoto(movie.getPoster(), 400, 600);
        initComponents();

    }

    private void initComponents() {
        this.setName("TicketAdd");
        // -----------TOP-------------
        /*
         * JPanel top=new JPanel();
         * top.setBackground(ColoringController.getBasicColor());
         * top.setBounds(0,0,800,40);
         * JLabel title = new JLabel("Add Ticket");
         * title.setBounds(350, 0, 300, 50);
         * title.setFont(FontController.getPrimaryFont(Font.BOLD, 24));
         * title.setForeground(ColoringController.getWhiteColor());
         * top.add(title);
         */
        // ---------------------------
        // -----------Body------------
        JPanel body = new JPanel();
        // body.setBackground(ColoringController.getLightGrayColor());
        body.setBounds(0, 0, 1220, 670);
        body.setLayout(null);
        // ---------img-----------
        JPanel img = new JPanel();

        img.setBackground(Color.BLACK);
        img.setBounds(800, 10, 410, 650);
        img.setLayout(new BorderLayout());
        img.add(poster, BorderLayout.CENTER);
        // -----------------------
        // -------titleP---0------
        JPanel titleP = new JPanel();

        titleM.setForeground(Color.BLACK);
        titleM.setHorizontalAlignment(SwingConstants.CENTER);
        titleM.setForeground(ColoringController.getWhiteColor());
        titleM.setFont(FontController.getPrimaryFont(ABORT, 24));
        titleP.setBounds(10, 10, 780, 50);
        titleP.setBackground(ColoringController.getTowColorDark());
        titleP.setLayout(new BorderLayout());
        titleP.add(titleM, BorderLayout.CENTER);
        // -----------------------
        // ---------Des---------

        JLabel description = new JLabel("Description");

        // descM.setPreferredSize(new Dimension(380, 200));
        descM.setBounds(10, 0, 780, 190);
        descM.setForeground(Color.BLACK);
        // descM.setHorizontalAlignment(SwingConstants.CENTER);
        descM.setFont(FontController.getPrimaryFont(ABORT, 18));
        // description.setPreferredSize(new Dimension(380, 40));
        description.setBounds(10, 0, 780, 40);
        description.setForeground(Color.BLACK);
        // description.setHorizontalAlignment(SwingConstants.CENTER);
        description.setFont(FontController.getPrimaryFont(Font.BOLD, 18));
        descP.setBounds(10, 70, 780, 170);
        descP.setBackground(Color.decode("#EAD7BB"));
        descP.setLayout(null);
        descP.add(description);
        descP.add(descM);
        // -----------------------
        // ---------Booking---------
        JPanel bookingP = new JPanel();
        // JLabel descM=new JLabel("XIHOO Gran Turismo");
        // descM.setForeground(Color.BLACK);
        // descM.setHorizontalAlignment(SwingConstants.CENTER);
        // titleM.setFont(FontController.getPrimaryFont(ABORT, 24));
        bookingP.setBounds(10, 250, 780, 350);
        bookingP.setBackground(Color.decode("#EAD7BB"));
        bookingP.setLayout(new BorderLayout());
        bookingP.setLayout(null);
        JPanel chairs=new JPanel();
        chairs.setBounds(10, 10, 300, 300);
        chairs.setBackground(ColoringController.getTowColorDark());
        chairs.setLayout(new GridLayout(8,8,3,3));
        int n=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                String s=Integer.toString(++n);
                chairs.add(itemChair(s));
               
        }
        }
        bookingP.add(chairs);
        // -----------------------
        // ---------Buttons---------
        JPanel addTick = new JPanel();
        JLabel bttickT = new JLabel("Add");
        bttickT.setForeground(Color.WHITE);
        bttickT.setHorizontalAlignment(SwingConstants.CENTER);
        bttickT.setFont(FontController.getPrimaryFont(ABORT, 24));
        addTick.setBounds(20, 615, 200, 40);
        addTick.setBackground(ColoringController.getBasicColor());
        addTick.setLayout(new BorderLayout());
        PanelsController.addActionToButton(addTick, "Tick");
        addTick.add(bttickT);

        JPanel closeP = new JPanel();
        JLabel closeT = new JLabel("Close");
        closeT.setForeground(Color.WHITE);
        closeT.setHorizontalAlignment(SwingConstants.CENTER);
        closeT.setFont(FontController.getPrimaryFont(ABORT, 24));
        closeP.setBounds(260, 615, 200, 40);
        closeP.setBackground(ColoringController.getBasicColor());
        closeP.setLayout(new BorderLayout());
        closeP.add(closeT);
        PanelsController.addActionToButton(closeP, "Close");
        // EventController.lightButton(closeP);
        // -----------------------
        body.add(img);
        body.add(titleP);
        body.add(descP);
        body.add(bookingP);
        body.add(addTick);
        body.add(closeP);
        // ---------------------------
        // ----------Buttom-----------
        JPanel buttom = new JPanel();
        buttom.setBackground(ColoringController.getBasicColor());
        buttom.setBounds(0, 580, 800, 20);

        // ---------------------------
        // -------Properites----------
        // setIconImage(new
        // ImageIcon("src\\main\\resources\\images\\ITEBestIcon.png").getImage());
        // setSize(800, 600);
        setBounds(60, 50, 1220, 670);
        // setUndecorated(true);
        // setLocationRelativeTo(null);
        setLayout(null);
        setBackground(Color.BLACK);
        // add(top);
        // add(top);

        add(body);
        // add(buttom);
        // ---------------------------
    }
    public JPanel itemChair(String num){
        JPanel panel=new JPanel();
        JLabel label =new JLabel(num);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new BorderLayout());
        panel.add(label,BorderLayout.CENTER);
        panel.setName(num);
        panel.setBackground(Color.decode("#F3EEEA"));
        PanelsController.addActionToButton(panel, "chair");
        return panel;
    }
}
