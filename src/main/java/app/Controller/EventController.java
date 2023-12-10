package main.java.app.Controller;

import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class EventController {
    public static void lightButton(JPanel panel) {
            panel.addMouseListener(new MouseListener() {
    
                @Override
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    
                    
                }
    
                @Override
                public void mousePressed(java.awt.event.MouseEvent e) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
                }
    
                @Override
                public void mouseReleased(java.awt.event.MouseEvent e) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
                }
    
                @Override
                public void mouseEntered(java.awt.event.MouseEvent e) {
                    panel.setBackground(ColoringController.getLightBasicColor());
                }
    
                @Override
                public void mouseExited(java.awt.event.MouseEvent e) {
                    panel.setBackground(ColoringController.getBasicColor());
    
                }
    
            });
    
        }
}
