package main.java.app.View.MovieView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import main.java.app.Controller.RoundedPanel;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;
import main.java.app.View.Misc.CustomScrollBarUI;
import main.java.app.View.Misc.MovieCard;
import main.java.app.Controller.ColoringController;

public class Home extends JPanel {
    public static JLabel imgbanner = new JLabel(ImageController.getBanar1Icon());
    public static JPanel body;
    JPanel mainPanel = new JPanel();
    int size = MovieCard.sizePanel();

    public void setBody(int n) {
        setVisible(false);
    }

    public Home() {
        initComponents();
    }

    public void initComponents() {
        mainPanel.setLayout(null);
        // ----------Top--------------
        JLabel tHome = new JLabel("Home Page");
        tHome.setBounds(10, 0, 300, 50);
        tHome.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        tHome.setForeground(ColoringController.getBlackColor());
        // ---------------------------

        // ---------banner------------
        imgbanner.setBounds(0, 0, 1180, 250);
        JPanel banner = new RoundedPanel(50);
        banner.setBounds(10, 50, 1180, 250);
        banner.setOpaque(false);
        banner.add(imgbanner);
        banner.setLayout(null);
        // ---------------------------

        // // ----------menu-------------
        // JPanel menu = new JPanel();
        // menu.setBackground(ColoringController.getTowColorDark());
        // menu.setBounds(10, 310, 1180, 40);
        // menu.setLayout(null);
        // // ---------------------------

        // -----------Body------------
        body = new JPanel();
        body.setLayout(null);
        body.setBackground(ColoringController.getSecoundColorLight());
        java.util.List<Movie> topMovies=new ArrayList<>();
        for(Movie movie: Database.movies)
            topMovies.add(movie);
        //Collections.copy(topMovies, Database.movies);
        Collections.sort(topMovies, Comparator.comparingDouble(Movie::getRate).reversed());

        for (int i = 0; i < topMovies.size(); i++) {
            body.add(new MovieCard(topMovies.get(i)));
        }
        size = MovieCard.sizePanel();
        body.setBounds(10, 310, 1180, size + 10);
        // ---------------------------

        // -------Properites----------
        this.setName("Home");
        setBounds(58, 49, 1224, 700);
        setLayout(new BorderLayout());

        mainPanel.setPreferredSize(new Dimension(1200, size + 350));
        mainPanel.add(tHome);
        mainPanel.add(banner);
        // mainPanel.add(menu);
        mainPanel.add(body);
        mainPanel.setBackground(ColoringController.getSecoundColorLight());
        // mainPanel.add(body);
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(40);
        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.setUI(new CustomScrollBarUI());
        add(scrollPane, BorderLayout.CENTER);
        // ---------------------------

    }

    @Override
    public void setVisible(boolean aFlag) {
        super.setVisible(aFlag);
        mainPanel.setVisible(aFlag);
        body.setVisible(aFlag);

    }
}
