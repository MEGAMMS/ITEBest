package main.java.app.Controller;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.*;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class AnimatedPanel extends JPanel {
    // public void setPrefixIcon(Icon prefixIcon) {
    // this.prefixIcon = prefixIcon;
    // initBorder();
    // }
    // public void settext(String text) {
    // this.text = text;
    // }

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }

    // private String text = "";
    private Animator animator;
    private int targetSize;
    private float animatSize;
    private Point pressedPoint;
    private float alpha;
    private Color effectColor = new Color(255, 255, 255);

    MouseListener listener;

    public AnimatedPanel(String img, String action, int X, int Y, int width, int height) {
        this.setBackground(Color.decode("#15151d"));
        // setContentAreaFilled(false);

        this.setLayout(new BorderLayout());
        this.add(ImageController.addPhoto(img), BorderLayout.CENTER);
        this.setBackground(ColoringController.getFirstColorDark());
        PanelsController.addActionToButton(this, action);
        setBounds(X, Y, width, height);
        initComponents();
    }

    public AnimatedPanel(String action, int X, int Y, int width, int height) {
        this.setBackground(Color.decode("#15151d"));
        // setContentAreaFilled(false);
        this.setLayout(new BorderLayout());
        this.setBounds(0, 170, 60, 100);
        this.setBackground(ColoringController.getFirstColorDark());
        PanelsController.addActionToButton(this, action);
        setBounds(X, Y, width, height);
        initComponents();
    }

    public void initComponents() {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                targetSize = Math.max(getWidth(), getHeight()) * 2;
                animatSize = 0;
                pressedPoint = me.getPoint();
                alpha = 0.5f;
                if (animator.isRunning()) {
                    animator.stop();
                }
                animator.start();
            }
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    alpha = 1 - fraction;
                }
                animatSize = fraction * targetSize;
                repaint();
            }
        };
        animator = new Animator(700, target);
        animator.setAcceleration(0.5f);
        animator.setDeceleration(0.5f);
        animator.setResolution(0);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRect(0, 0, width, height);
        if (pressedPoint != null) {
            g2.setColor(effectColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
            g2.fillRect((int) (pressedPoint.x - animatSize / 2), (int) (pressedPoint.y - animatSize / 2),
                    (int) animatSize, (int) animatSize);
        }
        g2.dispose();
        grphcs.drawImage(img, 0, 0, null);
        // paintIcon(grphcs);
        super.paintComponent(grphcs);
    }

}