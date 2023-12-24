package main.java.app.View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Movie;

public class MainFrame extends JFrame {
    // Panels
    public static JPanel mainPanel = new JPanel();
    public static JPanel Top = new JPanel();
    public static JPanel toolbar = new JPanel();

    public static Home PHome = new Home();
    public static Profile PProfile = new Profile();
    public static TicketAdd PTicketAdd = new TicketAdd(0);
    public static Signup PSignup = new Signup();
    public static Login login = new Login();
    public static MoviesListView PMoviesListView = new MoviesListView();

    public void showAddTicket(int id) {
        PTicketAdd.setVisible(false);
        remove(PTicketAdd);
        PTicketAdd = new TicketAdd(id);
        add(PTicketAdd);
        PanelsController.switchPanels("");
        PTicketAdd.setVisible(true);

    }

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {

        /*
         * Cardpanel=new JPanel(new CardLayout());
         * Cardpanel.setBounds(60, 50, 1220, 670);
         * Cardpanel.add(h,"Home");
         * Cardpanel.add(PProfile,"Profile");
         */

        Headbar headbar = new Headbar();
        mainPanel.add(headbar);
        Toolbar toolbar = new Toolbar();
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
        mainPanel.add(Top);
        mainPanel.add(toolbar);

        MainPanels.addPanel(PHome);
        MainPanels.addPanel(PProfile);
        MainPanels.addPanel(PSignup);
        MainPanels.addPanel(PMoviesListView);

        mainPanel.add(PHome);
        mainPanel.add(PProfile);
        mainPanel.add(PSignup);
        mainPanel.add(login);
        mainPanel.add(PMoviesListView);
        PHome.setVisible(false);
        PProfile.setVisible(false);
        PTicketAdd.setVisible(true);
        PSignup.setVisible(false);
        login.setVisible(false);
        PMoviesListView.setVisible(false);

        add(mainPanel);

        setVisible(true);
        // --------------------------------
    }
    /*
     * public static void main(String[] args) {
     * SwingUtilities.invokeLater(new Runnable() {
     * 
     * @Override
     * public void run() {
     * //new Lobby();
     * }
     * });
     * }
     */

}
