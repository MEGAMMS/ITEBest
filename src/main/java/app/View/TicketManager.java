package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDateTime;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import com.k33ptoo.components.KButton;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
import main.java.app.Controller.RoundedPanel;
import main.java.app.Controller.TicketController;
import main.java.app.Controller.Utils;
import main.java.app.Model.Database;
import main.java.app.Model.Ticket;

public class TicketManager extends JPanel {
    // identifications
    public static JPanel mainPanel;
    public static JPanel body;
    public static int scrollBarHight = 0;
    JScrollPane scrollPane;

    public void refresh() {
        body.removeAll();
        if (!Utils.isLogedIn())
            return;
        scrollBarHight = Database.currUser.tickets.size()*53;
        body.setBackground(ColoringController.getSecoundColorLight());
        System.out.println("refresh:"+ Database.currUser.tickets.size());
        for (Ticket ticket : Database.currUser.tickets) {
            TicketCard card = new TicketCard(ticket);
            System.err.println(ticket);
            System.err.println(ticket.getId());
            card.setBounds(10, 54 * ticket.getId(), 1180, 50);
            body.add(card);
        }
        body.setBounds(0, 100, 1200, scrollBarHight + 200);
        mainPanel.setPreferredSize(new Dimension(1224, scrollBarHight + 200));

    }

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
        Top.setBackground(ColoringController.getSecoundColorDark1());
        Top.setBounds(10, 10, 1180, 35);
        Top.setLayout(null);

        JLabel title = new JLabel("My tickets");
        title.setBounds(510, 0, 300, 35);
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 29));
        title.setForeground(ColoringController.getBlackColor());
        Top.add(title);
        mainPanel.add(Top);
        // ---------------------------
        JPanel header = new JPanel();
        header.setBackground(ColoringController.getSecoundColorDark2());
        header.setBounds(10, 45, 1180, 35);
        header.setLayout(null);
        JLabel ID = new JLabel("ID");
        ID.setBounds(0, 0, 60, 40);
        ID.setHorizontalAlignment(SwingConstants.CENTER);
        ID.setForeground(ColoringController.getWhiteColor());
        ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(ID);
        JLabel titleM = new JLabel("Title");
        titleM.setBounds(60, 0, 200, 40);
        titleM.setHorizontalAlignment(SwingConstants.CENTER);
        titleM.setForeground(ColoringController.getWhiteColor());
        titleM.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(titleM);
        JLabel showtime = new JLabel("Showtime");
        showtime.setBounds(300, 0, 200, 40);
        showtime.setHorizontalAlignment(SwingConstants.CENTER);
        showtime.setForeground(ColoringController.getWhiteColor());
        showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(showtime);
        JLabel hall = new JLabel("Hall");
        hall.setBounds(540, 0, 200, 40);
        hall.setHorizontalAlignment(SwingConstants.CENTER);
        hall.setForeground(ColoringController.getWhiteColor());
        hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(hall);
        JLabel price = new JLabel("Price");
        price.setBounds(760, 0, 200, 40);
        price.setHorizontalAlignment(SwingConstants.CENTER);
        price.setForeground(ColoringController.getWhiteColor());
        price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(price);
        JLabel withdraw = new JLabel("Withdraw");
        withdraw.setBounds(960, 0, 200, 40);
        withdraw.setHorizontalAlignment(SwingConstants.CENTER);
        withdraw.setForeground(ColoringController.getWhiteColor());
        withdraw.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        header.add(withdraw);
        mainPanel.add(header);
        // -----------Body------------
        // System.out.println(Database.movies.get(0).showtimes.get(0));
        body = new JPanel(null);
        //System.out.println(Database.currUser.tickets);
        refresh();
        mainPanel.add(body);
        // ---------------------------.
        // ---------------------------
        scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(40);
        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.setUI(new CustomScrollBarUI());
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    class TicketCard extends RoundedPanel {
        public KButton withdraw;

        public TicketCard(Ticket ticket) {
            super(10);
            setOpaque(false);
            this.setBackground(ColoringController.getSecoundColor());
            this.setLayout(null);
            JLabel ID = new JLabel(Integer.toString(ticket.getId()));
            ID.setBounds(3, 2, 60, 46);
            ID.setHorizontalAlignment(SwingConstants.CENTER);
            ID.setForeground(ColoringController.getBlackColor());
            ID.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            ID.setBackground(ColoringController.getWhiteColor());
            ID.setOpaque(true);
            this.add(ID);
            JLabel title = new JLabel(ticket.getMovie().getTitle());
            title.setBounds(60, 0, 200, 50);
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setForeground(ColoringController.getBlackColor());
            title.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(title);
            JLabel showtime = new JLabel("" + ticket.getShowtime());
            showtime.setBounds(300, 2, 200, 46);
            showtime.setHorizontalAlignment(SwingConstants.CENTER);
            showtime.setForeground(ColoringController.getBlackColor());
            showtime.setBackground(ColoringController.getWhiteColor());
            showtime.setOpaque(true);
            showtime.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(showtime);
            JLabel hall = new JLabel(ticket.getMovie().getCinema().getName() + " Num Seat(" + ticket.getSeatId() + ")");
            hall.setBounds(540, 0, 200, 50);
            hall.setHorizontalAlignment(SwingConstants.CENTER);
            hall.setForeground(ColoringController.getBlackColor());
            hall.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(hall);
            JLabel price = new JLabel("" + ticket.getMovie().getPrice());
            price.setBounds(760, 2, 200, 46);
            price.setHorizontalAlignment(SwingConstants.CENTER);
            price.setForeground(ColoringController.getBlackColor());
            price.setBackground(ColoringController.getWhiteColor());
            price.setOpaque(true);
            price.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
            this.add(price);
            withdraw = new KButton();
            withdraw.setText("withdraw");
            withdraw.setFont(FontController.getSecondryFont(Font.BOLD, 8));
            withdraw.setForeground(ColoringController.getBlackColor());
            PanelsController.setKButtonlight(withdraw, ColoringController.getRedColor());
            withdraw.setkBorderRadius(10);
            withdraw.setBounds(1000, 10, 120, 30);
            withdraw.setBackground(Color.RED);
            withdraw.addMouseListener(new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    TicketController.UnBook(ticket);
                    refresh();
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
                
            });
            this.add(withdraw);
        }

    }
}
