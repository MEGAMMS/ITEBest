package main.java.app.Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.app.View.Home;
import main.java.app.View.Lobby;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import main.java.app.ITEBest;
import main.java.app.Model.Database;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Movie;
import main.java.app.View.RoundedBorder;
import main.java.app.View.Ticketadd;
import main.java.app.View.itemMove;

public class PanelsController {
    public static Border roundedBorder(int n){
        return new RoundedBorder(n);
    }

    public static void switchPanels(JPanel panel) {
        for (JPanel p : MainPanels.Panels) {
            p.setVisible(("B" + p.getName()).equals(panel.getName()));
            // System.err.println(("B" + p.getName()));
            // System.err.println(panel.getName());
            // System.err.println(("B" + p.getName()).equals(panel.getName()) + "\n");
        }
    }

    public static void addToToolbar(JPanel panel,String nameP) {

        
        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                //PanelsController.switchPanels(panel);
                //Lobby.PHome.setBody(5);
                
                /*CardLayout cardLayout = (CardLayout) Lobby.Cardpanel.getLayout();
                cardLayout.show(Lobby.Cardpanel, nameP);*/
                switch (nameP) {
                    case "Home":
                        Lobby.PHome.setVisible(true);
                        Lobby.PProfile.setVisible(false);
                        Lobby.ticketadd.setVisible(false);
                        break;
                    case "Profile":
                     Lobby.PHome.setVisible(false);
                        Lobby.PProfile.setVisible(true);
                        Lobby.ticketadd.setVisible(false);

                    break;
                    case "Close":
                        Lobby.PHome.setVisible(true);
                        Lobby.PProfile.setVisible(false);
                        Lobby.ticketadd.setVisible(false);

                    break;
                    default:
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseReleased'");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                panel.setBackground(ColoringController.getLightBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                panel.setBackground(ColoringController.getBasicColor());

            }
        };
        panel.addMouseListener(ms);
        ActionListener al=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        };
       
    }
    
    public static void Book(itemMove panel,JPanel button,JLabel label,Movie n) {

        
        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println(panel.movie.getTitle());
                //ITEBest.lobby.showAddTicket(Database.movies.get(0));
                Lobby.PHome.setVisible(false);
                Lobby.ticketadd.setVisible(true);
                Ticketadd.setValues(Lobby.ticketadd, Database.movies.get(Database.movies.indexOf(n)));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                // throw new UnsupportedOperationException("Unimplemented method
                // 'mouseReleased'");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                label.setForeground(ColoringController.getBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                label.setForeground(Color.GRAY);
            }
        };
        
        button.addMouseListener(ms);
        //panel.addMouseListener(ms);
    }
}
