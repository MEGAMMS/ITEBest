package main.java.app.View;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import main.java.app.Controller.ImageController;
import main.java.app.Model.MainPanels;

public class MainFrame extends JFrame {
    // Panels
    public static JPanel mainPanel = new JPanel();
    public static Toolbar toolbar;
    public static Home PHome = new Home();
    public static Profile PProfile = new Profile();
    public static TicketAdd PTicketAdd = new TicketAdd();
    public static Signup PSignup = new Signup();
    public static Login PLogin = new Login();
    public static MoviesListView PMoviesListView = new MoviesListView();

    // public void showAddTicket(int id) {
    //     PTicketAdd.setVisible(false);
    //     remove(PTicketAdd);
    //     PTicketAdd = new TicketAdd(id);
    //     add(PTicketAdd);
    //     PanelsController.switchPanels("");
    //     PTicketAdd.setVisible(true);

    // }

    public MainFrame() throws IOException {
        initComponents();
    }

    private void initComponents() throws IOException {

        /*
         * Cardpanel=new JPanel(new CardLayout());
         * Cardpanel.setBounds(60, 50, 1220, 670);
         * Cardpanel.add(h,"Home");
         * Cardpanel.add(PProfile,"Profile");
         */

        Headbar headbar = new Headbar();
        mainPanel.add(headbar);
        toolbar = new Toolbar();
        mainPanel.add(toolbar);

        // ----------Properties------------
        setIconImage(ImageController.getITEBestIcon().getImage());
        setSize(1280, 720);
        mainPanel.setSize(1280, 720);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Border roundedBorder = new RoundedBorder(10);
        mainPanel.setBorder(roundedBorder);
        setLayout(null);
        mainPanel.setBorder(roundedBorder);
        mainPanel.setLayout(null);

        MainPanels.addPanel(PTicketAdd);
        MainPanels.addPanel(PHome);
        MainPanels.addPanel(PProfile);
        MainPanels.addPanel(PSignup);
        MainPanels.addPanel(PMoviesListView);
        MainPanels.addPanel(PLogin);

        mainPanel.add(PHome);
        mainPanel.add(PProfile);
        mainPanel.add(PSignup);
        mainPanel.add(PLogin);
        mainPanel.add(PMoviesListView);
        mainPanel.add(PTicketAdd);
        PHome.setVisible(false);
        PProfile.setVisible(true);
        PSignup.setVisible(false);
        PLogin.setVisible(false);
        PMoviesListView.setVisible(false);
        PTicketAdd.setVisible(false);

        add(mainPanel);
        setVisible(true);
        // --------------------------------
    }
}
