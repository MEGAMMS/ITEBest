package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Font;
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
import com.k33ptoo.components.KButton;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.LabelController;
import main.java.app.Controller.PanelsController;
import main.java.app.Controller.RoundedPanel;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.Model.Showtime;

public class TicketAdd extends JPanel {

    public Movie movie;
    JPanel descP = new JPanel();
    public JSpinner numTick;
    public JLabel titleM;
    public JLabel descM;
    public JLabel poster;
    public JComboBox<String> comboBoxShowtime;
    public JLabel numberTicketFree;
    public JPanel BookingPanel;
    public CommentsMovie CommentsPanel;
    public JPanel chairs;
    public JPanel menu;
    public JPanel checkLogin;
    public JPanel addTick;
    public JLabel MsgError, priceMovie, priceAll;
    public Showtime SelectedShowtime;

    // HHH
    public void updateData(int id) {
        System.out.println(id);
        this.movie = Database.movies.get(id);
        this.titleM.setText(movie.getTitle());
        JLabel label = ImageController.addPhoto(movie.getPoster(), 400, 600);
        this.poster.setIcon(label.getIcon());
        this.descM.setText("<html>" + this.movie.getDescription() + "\r\n" + //
                "\r\n" + //
                "</html>");
        comboBoxShowtime.removeAllItems();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(
                movie.showtimes.stream().map(Object::toString).toArray(String[]::new));
        comboBoxShowtime.setModel(model);
        SelectedShowtime = MainFrame.PTicketAdd.movie.showtimes.stream()
                .filter(obj -> obj.toString().equals((String) comboBoxShowtime.getSelectedItem())).findFirst()
                .orElse(null);
        MainFrame.PTicketAdd.numberTicketFree.setText("Number Ticket Free " + SelectedShowtime.getSeats());
        priceMovie.setText("Price One Ticket: " + movie.getPrice() + " S.P");
        // for (Showtime s : movie.showtimes)
        // this.comboBoxShowtime.addItem((String)s.getDate().toString());
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
        StarRatingComponent starRating = new StarRatingComponent(5);
        starRating.setBounds(120, 10,135, 30);
        starRating.setBackground(ColoringController.getSecoundColorDark1());
        starRating.setVisible(true);
        starRating.setOpaque(true);
        descP.add(starRating);
        //------------------------
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
        // ------checkLogin---------
        checkLogin = new JPanel();
        checkLogin.setBounds(10, 280, 780, 320);
        checkLogin.setBackground(ColoringController.getSecoundColor());
        checkLogin.setLayout(null);
        body.add(checkLogin);
        JLabel imgNeedLogin = ImageController.addPhoto("needLogin.png", 480, 320);
        imgNeedLogin.setBounds(150, 0, 480, 320);
        KButton clickForLongin = new KButton();
        clickForLongin.setText("Regecter");
        clickForLongin.setBounds(270, 136, 150, 30);
        PanelsController.setKButtonlight(clickForLongin, ColoringController.getFirstColor());
        PanelsController.addActionToKButton(clickForLongin, "Regecter");
        checkLogin.add(clickForLongin);
        checkLogin.add(imgNeedLogin);
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
        showtimes.setForeground(ColoringController.getBlackColor());
        showtimes.setBounds(10, 20, 150, 40);
        showtimes.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        BookingPanel.add(showtimes);
        comboBoxShowtime = new JComboBox<>();
        comboBoxShowtime.setForeground(ColoringController.getBlackColor());
        comboBoxShowtime.setBackground(ColoringController.getWhiteColor());
        comboBoxShowtime.setUI(new CustomComboBoxUI());
        comboBoxShowtime.setBounds(160, 20, 280, 40);
        comboBoxShowtime.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        //PanelsController.ChooseComboShowTimes(comboBoxShowtime);
        BookingPanel.add(comboBoxShowtime);
        JLabel numberTicket = new JLabel("Number Ticket: ");
        numberTicket.setForeground(ColoringController.getBlackColor());
        numberTicket.setBounds(10, 90, 200, 40);
        numberTicket.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        BookingPanel.add(numberTicket);
        SpinnerNumberModel model = new SpinnerNumberModel(1, 1, 64, 1);
        numTick = new JSpinner(model);
        numTick.setForeground(ColoringController.getBlackColor());
        numTick.setBackground(ColoringController.getWhiteColor());
        PanelsController.ChooseSpinner(numTick);
        JFormattedTextField textField = ((JSpinner.DefaultEditor) numTick.getEditor()).getTextField();
        textField.setEditable(false);
        numTick.setBounds(210, 90, 80, 40);
        numTick.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));

        BookingPanel.add(numTick);

        numberTicketFree = new JLabel("Number Ticket Free");
        numberTicketFree.setForeground(ColoringController.getGreenColor());
        numberTicketFree.setBounds(300, 90, 200, 40);
        numberTicketFree.setFont(FontController.getSecondryFont(Font.BOLD, 16));
        BookingPanel.add(numberTicketFree);
        JLabel imgTicket1 = ImageController.addPhoto("booking.png", 600, 400);
        imgTicket1.setBounds(240, 0, 600, 400);
        BookingPanel.add(imgTicket1);
        JLabel imgTicket2 = ImageController.addPhoto("Tickets.png", 150, 100);
        imgTicket2.setBounds(150, 220, 150, 100);
        // BookingPanel.add(imgTicket2);
        MsgError = new JLabel("");
        MsgError.setBounds(10, 160, 300, 30);
        MsgError.setForeground(ColoringController.getRedColor());
        MsgError.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 16));
        BookingPanel.add(MsgError);

        priceMovie = new JLabel("Price Movie: 100 s.p");
        priceMovie.setBounds(10, 210, 300, 30);
        priceMovie.setForeground(ColoringController.getBlackColor());
        priceMovie.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        BookingPanel.add(priceMovie);

        priceAll = new JLabel("Price All: 1000 s.p");
        priceAll.setBounds(10, 260, 300, 30);
        priceAll.setForeground(ColoringController.getFirstColorDark());
        priceAll.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 22));
        BookingPanel.add(priceAll);

        // -----------------------
        // ---------Buttons---------
        addTick = new RoundedPanel(30);
        addTick.setOpaque(false);
        JLabel bttickT = new JLabel("Add");
        bttickT.setForeground(ColoringController.getWhiteColor());
        bttickT.setHorizontalAlignment(SwingConstants.CENTER);
        bttickT.setFont(FontController.getPrimaryFont(ABORT, 24));
        addTick.setBounds(20, 615, 200, 40);
        addTick.setBackground(ColoringController.getFirstColorDark());
        addTick.setLayout(new BorderLayout());
        PanelsController.addActionToButton(addTick, "Tick");
        addTick.add(bttickT);

        JPanel closeP = new RoundedPanel(30);
        closeP.setOpaque(false);
        JLabel closeT = new JLabel("Close");
        closeT.setForeground(ColoringController.getWhiteColor());
        closeT.setHorizontalAlignment(SwingConstants.CENTER);
        closeT.setFont(FontController.getPrimaryFont(ABORT, 24));
        closeP.setBounds(260, 615, 200, 40);
        closeP.setBackground(ColoringController.getFirstColorDark());
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
        menu.setVisible(true);
        BookingPanel.setVisible(false);
        CommentsPanel.setVisible(false);
        body.setBackground(ColoringController.getSecoundColor());
        // ---------------------------
        // ----------Buttom-----------
        JPanel buttom = new JPanel();
        buttom.setBackground(ColoringController.getFirstColorDark());
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
