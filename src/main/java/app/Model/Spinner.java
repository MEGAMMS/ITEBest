package main.java.app.Model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Spinner extends JPanel {
    private int angle = 0;
    Color color;

    public Spinner(Color color) {
        this.color = color;
    }

    public void rotate() {
        angle += 8;
        angle %= 360;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();
        int x = (width - 50) / 2;
        int y = (height - 50) / 2;

        g2d.rotate(Math.toRadians(angle), x + 25, y + 25);
        int strokeWidth = 6;
        g2d.setStroke(new BasicStroke(strokeWidth));
        g2d.setColor(color);
        g2d.drawArc(x, y, 50, 50, 0, 260);

        g2d.dispose();
    }
}