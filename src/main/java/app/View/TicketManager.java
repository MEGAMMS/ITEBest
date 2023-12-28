package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.time.LocalDateTime;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Showtime;
import main.java.app.Model.Tags;
import main.java.app.Model.Ticket;

public class TicketManager extends JPanel {
    // identifications
    public static JPanel mainPanel;

    public TicketManager() {
        initComponents();
    }

    private void initComponents() {
        this.setName("TicketManager");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(ColoringController.getWhiteColor());
        // ----------Top-------------
        JPanel Top = new JPanel();
        Top.setBackground(ColoringController.getSecoundColorDark1());
        Top.setBounds(10, 10, 1180, 35);
        Top.setLayout(null);

        JLabel tMovie = new JLabel("My tickets");
        tMovie.setBounds(510, 0, 300, 35);
        tMovie.setFont(FontController.getPrimaryFont(Font.BOLD, 29));
        Top.add(tMovie);
        // ---------------------------
        // -----------Body------------
        Ticket t = new Ticket(5, Database.movies.get(0), null, new Showtime(LocalDateTime.of(2024, 1, 15, 10, 0)));
        JPanel TicketCard = new JPanel();
        TicketCard.setBackground(ColoringController.getSecoundColorDarkLight1());
        TicketCard.setBounds(10,50, 1180, 80);
        TicketCard.setLayout(null);
        JLabel ID=new JLabel("ID:"+Integer.toString(t.getId()));
        ID.setBounds(0,20,1000,40);
        ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE,18));
        TicketCard.add(ID);
        JLabel title= new JLabel("Title:"+t.getmovie().getTitle());
        title.setBounds(60, 20, 1000, 40);
        title.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE,18));
        TicketCard.add(title);
        JLabel showtime = new JLabel("Showtime:"+"hhh");
        showtime.setBounds(300, 20, 1000, 40);
        showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE,18));
        TicketCard.add(showtime);
        JLabel hall = new JLabel("Hall:"+t.getmovie().getCinema().getName());
        hall.setBounds(490, 20, 1000, 40);
        hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE,18));
        TicketCard.add(hall);
        JLabel price = new JLabel("Price:"+t.getmovie().getprice());
        price.setBounds(660, 20, 1000, 40);
        price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE,18));
        TicketCard.add(price);
        JButton withdraw = new JButton("withdraw");
        withdraw.setBounds(860, 20, 300, 40);
        TicketCard.add(withdraw);

        // ---------------------------.
        // ---------------------------
        mainPanel.add(Top);
        mainPanel.add(TicketCard);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    

}
