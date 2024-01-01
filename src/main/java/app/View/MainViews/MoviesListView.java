package main.java.app.View.MainViews;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Tags;
import main.java.app.View.Misc.CustomScrollBarUI;
import main.java.app.View.Misc.MovieCard;

public class MoviesListView extends JPanel {
    // identifications
    public static JPanel mainPanel;
    private static String currBody = "All";
    HashMap<String, JPanel> bodies = new HashMap<>();

    public MoviesListView() {
        initComponents();
    }

    public void refresh(String nextBody) {

        bodies.get(currBody).setVisible(false);
        bodies.get(nextBody).setVisible(true);
        currBody = nextBody;
    }

    private void initComponents() {
        this.setName("MoviesListView");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(ColoringController.getWhiteColor());
        // ----------Top-------------
        JPanel Top = new JPanel();
        Top.setBackground(ColoringController.getSecoundColorDark2());
        Top.setBounds(10, 10, 1180, 35);
        Top.setLayout(null);

        JLabel tMovie = new JLabel("Movies Page");
        tMovie.setBounds(510, 0, 300, 35);
        tMovie.setFont(FontController.getPrimaryFont(Font.BOLD, 29));
        tMovie.setForeground(ColoringController.getWhiteColor());
        Top.add(tMovie);
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(Tags.tags.toArray(new String[0]));
        JComboBox<String> comboBox = new JComboBox<>(model);
        comboBox.setBounds(10, 5, 200, 23);
        comboBox.setForeground(ColoringController.getBlackColor());
        comboBox.setBackground(ColoringController.getWhiteColor());
        comboBox.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        PanelsController.ChooseComboPanel(comboBox);
        Top.add(comboBox);
        // ---------------------------
        // -----------Body------------
        for (String tag : Tags.tags) {
            JPanel body = initBody(tag);
            body.setVisible(false);
            mainPanel.add(body);
            bodies.put(tag, body);
        }
        bodies.get("All").setVisible(true);
        // ---------------------------
        // ---------------------------
        mainPanel.setPreferredSize(new Dimension(1200, bodies.get("All").getHeight() + 100));
        mainPanel.add(Top);
        mainPanel.setBackground(ColoringController.getSecoundColorLight());
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(40);
        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.setUI(new CustomScrollBarUI());
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel initBody(String tag) {
        JPanel body = new JPanel();
        MovieCard.restSize();
        body.setLayout(null);
        body.setBackground(ColoringController.getSecoundColorLight());
        for (int i = 0; i < Database.movies.size(); i++) {
            // System.out.println(Database.movies.get(i).getTag());
            if (Database.movies.get(i).getTag().equals(tag) || tag.equals("All"))
                body.add(new MovieCard(Database.movies.get(i)));
        }
        body.setBounds(10, 60, 1180, MovieCard.sizePanel() + 10);
        return body;
    }

}
