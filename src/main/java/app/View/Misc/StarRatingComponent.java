package main.java.app.View.Misc;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import main.java.app.Model.Movie;

public class StarRatingComponent extends JPanel {
    private int rating; // Current rating (number of filled stars)
    private int maxRating; // Maximum rating (total number of stars)
    private static final int STAR_SIZE = 20; // Size of each star

    public StarRatingComponent(int maxRating,Movie movie) {
        this.rating = 0;
        this.maxRating = maxRating;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int mouseX = e.getX();
                int clickedStar = mouseX / STAR_SIZE + 1; // Calculate which star was clicked
                setRating(clickedStar);
                movie.rateUser=rating;
            }
        });
    }

    public void setRating(int rating) {
        if (rating >= 0 && rating <= maxRating) {
            this.rating = rating;
            // Database.save();
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < maxRating; i++) {
            if (i < rating) {
                // Draw a filled star
                drawStar(g, i * STAR_SIZE, 0, true);
            } else {
                // Draw an empty star
                drawStar(g, i * STAR_SIZE, 0, false);
            }
        }
    }

    private void drawStar(Graphics g, int x, int y, boolean filled) {
        int[] xPoints = {10, 13, 20, 15, 19, 10, 1, 5, 0, 6};
        int[] yPoints = {0, 7, 7, 12, 20, 15, 20, 12, 7, 7};

        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] += x;
            yPoints[i] += y;
        }

        if (filled) {
            g.setColor(Color.YELLOW); // Filled star color
            g.fillPolygon(xPoints, yPoints, xPoints.length);
        } else {
            g.setColor(Color.BLACK); // Empty star border color
            g.drawPolygon(xPoints, yPoints, xPoints.length);
        }
    }
}