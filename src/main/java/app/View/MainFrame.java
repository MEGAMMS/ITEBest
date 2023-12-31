package main.java.app.View;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import main.java.app.Controller.ImageController;
import main.java.app.Model.MainPanels;
import main.java.app.View.Misc.Headbar;
import main.java.app.View.Misc.Toolbar;
import main.java.app.View.MovieView.Home;
import main.java.app.View.MovieView.Login;
import main.java.app.View.MovieView.MoviesListView;
import main.java.app.View.MovieView.Profile;
import main.java.app.View.MovieView.Settings;
import main.java.app.View.MovieView.Signup;
import main.java.app.View.MovieView.TicketAdd;
import main.java.app.View.MovieView.TicketManager;

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
    public static TicketManager PTicketManager = new TicketManager();
    public static Settings PSettings =new Settings();


    public MainFrame() throws IOException {
        initComponents();
    }

    private void initComponents() throws IOException {

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
        setLayout(null);
        mainPanel.setLayout(null);

        MainPanels.addPanel(PHome);
        MainPanels.addPanel(PTicketAdd);
        MainPanels.addPanel(PProfile);
        MainPanels.addPanel(PSignup);
        MainPanels.addPanel(PMoviesListView);
        MainPanels.addPanel(PLogin);
        MainPanels.addPanel(PTicketManager);
        MainPanels.addPanel(PSettings);

        for(JPanel p : MainPanels.Panels){
            mainPanel.add(p);
            p.setVisible(false);
        }
        MainPanels.Panels.get(0).setVisible(true);

        add(mainPanel);
        setVisible(true);
        // --------------------------------
    }
}
