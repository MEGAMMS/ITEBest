package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;

public class MoviesListView extends JPanel {
    // identifications
    public static JPanel mainPanel;
    public static JPanel menu;
    public static int sizeP = 0;
    public static JPanel All;
    public static JPanel sadness;
    public static JPanel farcical;
    public static JPanel action;
    public static JPanel adventure;

    public MoviesListView() {
        initComponents();
    }

    private void initComponents() {
        this.setName("MoviesListView");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        // ----------menu-------------
        menu = new JPanel();
        menu.setBackground(ColoringController.getDarkBasicColor());
        menu.setBounds(10, 10, 1190, 50);
        menu.setLayout(null);

        String[] tags = { "All", "farcical", "action", "sadness", "adventure" };
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(tags);
        JComboBox<String> comboBox = new JComboBox<>(model);
        comboBox.setBounds(10, 5, 200, 40);
        comboBox.setFont(FontController.getSecondryFont(Font.CENTER_BASELINE, 18));
        menu.add(comboBox);
        // ---------------------------
        // Topic Move

        sadness = setMoves("sadness", 70);
        mainPanel.add(sadness);
        sadness.setVisible(false);

        farcical = setMoves("farcical", 70);
        mainPanel.add(farcical);
        farcical.setVisible(false);

        action = setMoves("action", 70);
        mainPanel.add(action);
        action.setVisible(false);
        adventure = setMoves("adventure", 70);
        mainPanel.add(adventure);
        adventure.setVisible(false);

        All = setMoves("All", 70);
        mainPanel.add(All);
        sizeP = All.getHeight();
        System.out.println(sizeP);

        PanelsController.ChooseComboPanel(comboBox);
        // ---------------------------
        mainPanel.setPreferredSize(new Dimension(1224, sizeP + 200));
        mainPanel.add(menu);
        JScrollPane scrollPane = new JScrollPane(mainPanel);
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        mainPanel.setBackground(ColoringController.getWhiteColor());
        add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel setMoves(String tag, int y) {
        //
        int size = 20;
        MovieCard.restSize();
        JPanel Con = new JPanel();
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel label = new JLabel(tag);
        // proparites
        panel2.setBounds(0, 0, 1190, 40);
        panel2.setBackground(ColoringController.getSlid());
        label.setForeground(Color.WHITE);
        label.setFont(FontController.getSecondryFont(Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(null);
        // add
        for (int i = 0; i < Database.movies.size(); i++) {
            if (Database.movies.get(i).getTag().equals(tag) || tag == "All") {
                System.out.println("MMM  " + Database.movies.get(i).getTitle());
                panel.add(new MovieCard(Database.movies.get(i)));
            }
        }
        //
        int mod = 0;
        if (MovieCard.length != 0)
            mod = ((MovieCard.length / 4) + 1) * 430;
        size += mod;
        panel2.add(label);
        add(panel2);
        panel.setBackground(ColoringController.getWhiteColor());
        panel.setBounds(0, 50, 1190, size + 10);
        Con.setLayout(null);
        Con.setBounds(10, y, 1190, size + 70);
        Con.setBackground(ColoringController.getBasicColor());
        Con.add(panel2);
        Con.add(panel);
        return Con;
    }

    public static void VisiblePanel(JPanel panel) {
        action.setVisible(false);
        adventure.setVisible(false);
        All.setVisible(false);
        farcical.setVisible(false);
        sadness.setVisible(false);
        panel.setVisible(true);

    }

}
