package main.java.app.View;
import javax.swing.border.Border;

import main.java.app.Controller.ColoringController;

import java.awt.*;

public class RoundedBorder implements Border {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius, this.radius, this.radius, this.radius);
    }

    public boolean isBorderOpaque() {
        return true;
    }

    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(ColoringController.getBlackColor());
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}