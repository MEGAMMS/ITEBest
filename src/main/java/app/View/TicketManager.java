package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Model.Database;
import main.java.app.Model.Showtime;
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
        System.out.println(Database.movies.get(0).showtimes.get(0));
        Ticket t = new Ticket(2, Database.movies.get(0), Database.users.get(0),Database.movies.get(0).showtimes.get(0));
        TicketCard testTicket = new TicketCard(t);
        // ---------------------------.
        // ---------------------------
        mainPanel.add(Top);
        mainPanel.add(testTicket);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    class TicketCard extends JPanel {
        public TicketCard(Ticket ticket) {
            this.setBackground(ColoringController.getSecoundColorDarkLight1());
            this.setBounds(10, 50, 1180, 80);
            this.setLayout(null);
            JLabel ID = new JLabel("ID:" + Integer.toString(ticket.getId()));
            ID.setBounds(0, 20, 1000, 40);
            ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(ID);
            JLabel title = new JLabel("Title:" + ticket.getMovie().getTitle());
            title.setBounds(60, 20, 1000, 40);
            title.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(title);
            JLabel showtime = new JLabel("Showtime:" + ticket.getShowtime());
            showtime.setBounds(300, 20, 1000, 40);
            showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(showtime);
            JLabel hall = new JLabel("Hall:" + ticket.getMovie().getCinema().getName());
            hall.setBounds(540, 20, 1000, 40);
            hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(hall);
            JLabel price = new JLabel("Price:" + ticket.getMovie().getPrice());
            price.setBounds(760, 20, 1000, 40);
            price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(price);
            JButton withdraw = new JButton("withdraw");
            withdraw.setBounds(860, 20, 300, 40);
            withdraw.setBackground(Color.RED);
            this.add(withdraw);
        }

    }
}
