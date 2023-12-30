package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.k33ptoo.components.KButton;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
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
        mainPanel.setBackground(ColoringController.getSecoundColorLight());
        // ----------Top-------------
        JPanel Top = new JPanel();
        Top.setBackground(ColoringController.getSecoundColorDark2());
        Top.setBounds(10, 10, 1180, 35);
        Top.setLayout(null);

        JLabel title = new JLabel("My tickets");
        title.setBounds(510, 0, 300, 35);
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 29));
        title.setForeground(ColoringController.getWhiteColor());
        Top.add(title);
        mainPanel.add(Top);
        // ---------------------------
        JPanel header = new JPanel();
        header.setBackground(ColoringController.getSecoundColorDark1());
        header.setBounds(10, 45, 1180, 35);
        header.setLayout(null);
        JLabel ID = new JLabel("ID");
        ID.setBounds(0, 0, 60, 40);
        ID.setHorizontalAlignment(SwingConstants.CENTER);
        ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(ID);
        JLabel titleM = new JLabel("Title");
        titleM.setBounds(60, 0, 200, 40);
        titleM.setHorizontalAlignment(SwingConstants.CENTER);
        titleM.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(titleM);
        JLabel showtime = new JLabel("Showtime");
        showtime.setBounds(300, 0, 200, 40);
        showtime.setHorizontalAlignment(SwingConstants.CENTER);
        showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(showtime);
        JLabel hall = new JLabel("Hall");
        hall.setBounds(540, 0, 200, 40);
        hall.setHorizontalAlignment(SwingConstants.CENTER);
        hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(hall);
        JLabel price = new JLabel("Price");
        price.setBounds(760, 0, 200, 40);
        price.setHorizontalAlignment(SwingConstants.CENTER);
        price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(price);
        JLabel withdraw = new JLabel("Withdraw");
        withdraw.setBounds(960, 0, 200, 40);
        withdraw.setHorizontalAlignment(SwingConstants.CENTER);
        withdraw.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(withdraw);
        mainPanel.add(header);
        // -----------Body------------
        // System.out.println(Database.movies.get(0).showtimes.get(0));
        Ticket t = new Ticket(2, Database.movies.get(0), Database.users.get(0),
                Database.movies.get(0).showtimes.get(0));
        TicketCard testTicket = new TicketCard(t);
        // ---------------------------.
        // ---------------------------

        mainPanel.add(testTicket);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    class TicketCard extends JPanel {
        public KButton withdraw;
        public int X, Y;

        public TicketCard(Ticket ticket) {
            X = 10;
            Y = 80;
            this.setBackground(ColoringController.getSecoundColor());
            this.setBounds(X, Y, 1180, 50);
            this.setLayout(null);
            JLabel ID = new JLabel(Integer.toString(ticket.getId()));
            ID.setBounds(0, 0, 60, 50);
            ID.setHorizontalAlignment(SwingConstants.CENTER);
            ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            ID.setBackground(ColoringController.getWhiteColor());
            ID.setOpaque(true);
            this.add(ID);
            JLabel title = new JLabel(ticket.getMovie().getTitle());
            title.setBounds(60, 0, 200, 50);
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(title);
            JLabel showtime = new JLabel("" + ticket.getShowtime());
            showtime.setBounds(300, 0, 200, 50);
            showtime.setHorizontalAlignment(SwingConstants.CENTER);
            showtime.setBackground(ColoringController.getWhiteColor());
            showtime.setOpaque(true);
            showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(showtime);
            JLabel hall = new JLabel(ticket.getMovie().getCinema().getName());
            hall.setBounds(540, 0, 200, 50);
            hall.setHorizontalAlignment(SwingConstants.CENTER);
            hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(hall);
            JLabel price = new JLabel("" + ticket.getMovie().getPrice());
            price.setBounds(760, 0, 200, 50);
            price.setHorizontalAlignment(SwingConstants.CENTER);
            price.setBackground(ColoringController.getWhiteColor());
            price.setOpaque(true);
            price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(price);
            withdraw = new KButton();
            withdraw.setText("withdraw");
            withdraw.setFont(FontController.getSecondryFont(Font.BOLD, 11));
            PanelsController.setKButtonlight(withdraw, ColoringController.getRedColor());
            withdraw.setkBorderRadius(10);
            withdraw.setBounds(1000, 10, 120, 30);
            withdraw.setBackground(Color.RED);
            this.add(withdraw);
        }

    }
}
