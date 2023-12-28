package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicComboBoxUI;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.LabelController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class TicketAdd extends JPanel {

    Movie movie;
    JPanel descP = new JPanel();
    public JLabel titleM;
    public JLabel descM;
    public JLabel poster;
    public JComboBox<String> comboBoxShowtime;
    public JLabel numberTicketFree;
    public JPanel BookingPanel;public CommentsMovie CommentsPanel;
    public JPanel chairs;
    public JPanel menu;

    public void updateData(int id) {
        this.movie = Database.movies.get(id);
        this.titleM.setText(movie.getTitle());
        JLabel label = ImageController.addPhoto(movie.getPoster(), 400, 600);
        this.poster.setIcon(label.getIcon());
        this.descM.setText("<html>" + this.movie.getDescription() + "\r\n" + //
                "\r\n" + //
                "</html>");
        comboBoxShowtime.setSelectedItem(null);
        comboBoxShowtime.removeAllItems();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(
                movie.showtimes.stream().map(Object::toString).toArray(String[]::new));
        comboBoxShowtime.setModel(model);
        // for (Showtime s : movie.showtimes)
        // this.comboBoxShowtime.addItem((String)s.getDate().toString());
        this.numberTicketFree.setText("Number Ticket Free " + movie.showtimes.get(0).seats.size());
        CommentsPanel.updateTextPane(movie);
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
        // -----------Body------------
        JPanel body = new JPanel();
        body.setBounds(0, 0, 1220, 670);
        body.setLayout(null);
        // ---------img-----------
        JPanel img = new JPanel();

        img.setBackground(ColoringController.getBlackColor());
        img.setBounds(800, 10, 410, 650);
        img.setLayout(new BorderLayout());
        img.add(poster, BorderLayout.CENTER);
        // -----------------------
        // -------titleP---0------
        JPanel titleP = new JPanel();

        titleM.setHorizontalAlignment(SwingConstants.CENTER);
        titleM.setForeground(ColoringController.getWhiteColor());
        titleM.setFont(FontController.getPrimaryFont(ABORT, 24));
        titleP.setBounds(10, 10, 780, 50);
        titleP.setBackground(ColoringController.getSecoundColorDark2());
        titleP.setLayout(new BorderLayout());
        titleP.add(titleM, BorderLayout.CENTER);
        // -----------------------
        // ---------Des---------

        JLabel description = new JLabel("Description");

        // descM.setPreferredSize(new Dimension(380, 200));
        descM.setBounds(10, 0, 780, 190);
        descM.setForeground(ColoringController.getBlackColor());
        // descM.setHorizontalAlignment(SwingConstants.CENTER);
        descM.setFont(FontController.getPrimaryFont(ABORT, 18));
        // description.setPreferredSize(new Dimension(380, 40));
        description.setBounds(10, 0, 780, 40);
        description.setForeground(ColoringController.getBlackColor());
        // description.setHorizontalAlignment(SwingConstants.CENTER);
        description.setFont(FontController.getPrimaryFont(Font.BOLD, 18));
        descP.setBounds(10, 70, 780, 160);
        descP.setBackground(ColoringController.getSecoundColorDark1());
        descP.setLayout(null);
        descP.add(description);
        descP.add(descM);
        // -----------------------
        menu = new JPanel();
        menu.setBounds(10, 240, 780, 30);
        menu.setBackground(ColoringController.getSecoundColorDark2());
        menu.setLayout(null);
        body.add(menu);
        JPanel addTickPanel = new JPanel();
        addTickPanel.setBounds(10, 0, 375, 30);
        addTickPanel.setBackground(ColoringController.getSecoundColorLight());
        addTickPanel.add(LabelController.addLabel("Booking", FontController.getSecondryFont(Font.BOLD, 18)));
        PanelsController.addActionToButton(addTickPanel, "ViewPanelTickInfo");
        menu.add(addTickPanel);

        JPanel addCommentsPanel = new JPanel();
        addCommentsPanel.setBounds(395, 0, 375, 30);
        addCommentsPanel.setBackground(ColoringController.getSecoundColorLight());
        addCommentsPanel.add(LabelController.addLabel("Comments", FontController.getSecondryFont(Font.BOLD, 18)));
        PanelsController.addActionToButton(addCommentsPanel, "ViewPanelComments");
        menu.add(addCommentsPanel);

        // ---------Comments---------
        CommentsPanel = new CommentsMovie(movie);

        body.add(CommentsPanel);
        CommentsPanel.setVisible(false);
        // ---------Booking---------
        BookingPanel = new JPanel();
        BookingPanel.setBounds(10, 280, 780, 320);
        BookingPanel.setBackground(ColoringController.getSecoundColorDark1());
        BookingPanel.setLayout(null);
        JLabel showtimes = new JLabel("Show Time: ");
        showtimes.setBounds(330, 20, 150, 40);
        showtimes.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        BookingPanel.add(showtimes);
        comboBoxShowtime = new JComboBox<>();
        comboBoxShowtime.setUI(new CustomComboBoxUI());
        comboBoxShowtime.setBounds(480, 20, 280, 40);
        comboBoxShowtime.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        BookingPanel.add(comboBoxShowtime);
        JLabel numberTicket = new JLabel("Number Ticket: ");
        numberTicket.setBounds(330, 90, 200, 40);
        numberTicket.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        BookingPanel.add(numberTicket);
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 64, 1);
        JSpinner numTick = new JSpinner(model);
        JFormattedTextField textField = ((JSpinner.DefaultEditor) numTick.getEditor()).getTextField();
        textField.setEditable(false);
        numTick.setBounds(500, 90, 80, 40);
        numTick.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));

        BookingPanel.add(numTick);

        numberTicketFree = new JLabel("Number Ticket Free");
        numberTicketFree.setForeground(ColoringController.getGreenColor());
        numberTicketFree.setBounds(600, 90, 200, 40);
        numberTicketFree.setFont(FontController.getSecondryFont(Font.BOLD, 14));
        BookingPanel.add(numberTicketFree);
        // -----------------------
        // ---------Buttons---------
        JPanel addTick = new JPanel();
        JLabel bttickT = new JLabel("Add");
        bttickT.setForeground(ColoringController.getWhiteColor());
        bttickT.setHorizontalAlignment(SwingConstants.CENTER);
        bttickT.setFont(FontController.getPrimaryFont(ABORT, 24));
        addTick.setBounds(20, 615, 200, 40);
        addTick.setBackground(ColoringController.getFirstColorDark2());
        addTick.setLayout(new BorderLayout());
        PanelsController.addActionToButton(addTick, "Tick");
        addTick.add(bttickT);

        JPanel closeP = new JPanel();
        JLabel closeT = new JLabel("Close");
        closeT.setForeground(ColoringController.getWhiteColor());
        closeT.setHorizontalAlignment(SwingConstants.CENTER);
        closeT.setFont(FontController.getPrimaryFont(ABORT, 24));
        closeP.setBounds(260, 615, 200, 40);
        closeP.setBackground(ColoringController.getFirstColorDark2());
        closeP.setLayout(new BorderLayout());
        closeP.add(closeT);
        PanelsController.addActionToButton(closeP, "Close");
        // EventController.lightButton(closeP);
        // -----------------------
        body.add(img);
        body.add(titleP);
        body.add(descP);
        body.add(BookingPanel);
        body.add(addTick);
        body.add(closeP);
        body.setBackground(ColoringController.getSecoundColor());
        // ---------------------------
        // ----------Buttom-----------
        JPanel buttom = new JPanel();
        buttom.setBackground(ColoringController.getFirstColorDark2());
        buttom.setBounds(0, 580, 800, 20);

        // ---------------------------
        // -------Properites----------

        setBounds(60, 50, 1220, 670);
        setLayout(null);
        setBackground(ColoringController.getBlackColor());
        add(body);
        // ---------------------------
    }

    private static class CustomComboBoxUI extends BasicComboBoxUI {
        @Override
        protected JButton createArrowButton() {
            return new JButton() {
                @Override
                public int getWidth() {
                    return 0;
                }
            };
        }
    }

}
