package main.java.app.Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import main.java.app.Model.MainPanels;

public class PanelsController {
    public static void switchPanels(JPanel panel) {
        for (JPanel p : MainPanels.Panels) {
            p.setVisible(("B" + p.getName()).equals(panel.getName()));
            // System.err.println(("B" + p.getName()));
            // System.err.println(panel.getName());
            // System.err.println(("B" + p.getName()).equals(panel.getName()) + "\n");
        }
    }

    public static void addToToolbar(JPanel panel) {
        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                PanelsController.switchPanels(panel);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
            }
        };
        panel.addMouseListener(ms);
    }
}
