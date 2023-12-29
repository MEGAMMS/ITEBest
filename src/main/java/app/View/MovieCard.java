package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class MovieCard extends JPanel {
    String tag;
    static int hash = 10;
    static int width = 280;
    static int heigh = 430;
    static int x = hash + 5;
    static int y = hash;
    static int length = 0;
    public int id;
    public Movie movie;
    public JLabel Btitel;
    public static void restSize() {
        hash = 10;
        width = 220;
        heigh = 430;
        x = hash + 5;
        y = hash;
        length = 0;
    }

    public MovieCard(int id) {
        this.id = id;
        width=220;
        movie = Database.movies.get(id);
        initComponents();
        fix();
        length++;

    }

    private void initComponents() {
        // ---------img-----------
        JPanel img = new JPanel();
        JLabel poster = ImageController.addPhoto(movie.getPoster(), 200, 300);
        img.setBounds(10, 10, 200, 300);
        img.setLayout(new BorderLayout());
        img.add(poster, BorderLayout.CENTER);

        JLabel titel = new JLabel(movie.getTitle());
        titel.setHorizontalAlignment(SwingConstants.CENTER);
        titel.setBounds(10, 305, width-20, 50);
        titel.setFont(FontController.getSecondryFont(Font.BOLD, 16));
        // -----------------------
        JPanel button = new JPanel();
        Btitel = new JLabel("See More");
        Btitel.setName(Integer.valueOf(id).toString());
        Btitel.setHorizontalAlignment(SwingConstants.CENTER);
        Btitel.setBounds(0, 0, width-20, 40);
        Btitel.setFont(FontController.getPrimaryFont(Font.BOLD, 18));
        button.setBackground(ColoringController.getWhiteColor());
        button.setBounds(10, 380, width-20, 40);
        button.setLayout(null);
        button.add(Btitel);
        button.setBorder(new LineBorder(ColoringController.getFirstColor(), 2, true));
        // button.setBorder(roundedBorder);
        PanelsController.addActionToLabel(Btitel,"TicketAdd");
        setLayout(null);
        setBounds(x+10, y, width, heigh);

        setBorder(PanelsController.roundedBorder(30));
        button.setBorder(PanelsController.roundedBorder(20));
        setBackground(ColoringController.getSecoundColor());
        add(img);
        add(titel);
        add(button);

    }

    public void fix() {
        if (x + width + hash > 1080) {
            y += heigh + hash;
            x = hash + 5;
        } else {
            x += width + hash;
        }
    }

    public static int sizePanel() {
        int size;
        if (length % 5 != 0) {
            size = ((length / 5) + 1) * (heigh + 10);
        } else {
            size = ((length /5)) * (heigh + hash);
        }
        return size;
    }
}
