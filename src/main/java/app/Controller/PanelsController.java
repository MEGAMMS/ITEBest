package main.java.app.Controller;

import java.awt.Color;
import java.awt.Font;
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

import com.k33ptoo.components.KButton;

import main.java.app.ITEBest;
import main.java.app.Model.Database;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Movie;
import main.java.app.View.RoundedBorder;
import main.java.app.View.Ticketadd;
import main.java.app.View.itemMove;

public class PanelsController {
    public static Border roundedBorder(int n) {
        return new RoundedBorder(n);
    }

    public static void setButtonN(KButton kButton) {
        kButton.setkAllowGradient(false);
        kButton.setFont(FontController.Roboto(Font.BOLD, 22));
        kButton.setkBackGroundColor(ColoringController.getBasicColor());
        kButton.setkForeGround(ColoringController.getWhiteColor());
        kButton.setkHoverColor(ColoringController.getWhiteColor());
        kButton.setkPressedColor(ColoringController.getLightBasicColor());
        kButton.setkSelectedColor(ColoringController.getBasicColor());
        ;
        kButton.setkHoverForeGround(ColoringController.getBasicColor());
        kButton.setBorder(null);
        kButton.setkFillButton(true);
        kButton.setkBorderRadius(30);
        kButton.setkIndicatorThickness(2);
        kButton.setkIndicatorColor(Color.BLACK);
    }

    public static void switchPanels(String name) {
        for (JPanel p : MainPanels.Panels) {
            if (p.getName().equals(name)) {
                p.setVisible(true);
            } else {
                p.setVisible(false);
            }
            // System.err.println(("B" + p.getName()));
            // System.err.println(panel.getName());
            // System.err.println(("B" + p.getName()).equals(panel.getName()) + "\n");
        }
    }

    public static void addActionToButton(JPanel buuton, String action) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // PanelsController.switchPanels(panel);
                // Lobby.PHome.setBody(5);

                /*
                 * CardLayout cardLayout = (CardLayout) Lobby.Cardpanel.getLayout();
                 * cardLayout.show(Lobby.Cardpanel, nameP);
                 */
                switch (action) {
                    case "Home":
                        switchPanels("Home");
                        break;
                    case "Profile":
                        if (ITEBest.LoginState.equals("none")) {
                            switchPanels("Singup");
                        } else {
                            switchPanels("Profile");
                        }
                        break;
                    case "Close":
                        switchPanels("Home");
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
                buuton.setBackground(ColoringController.getLightBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                buuton.setBackground(ColoringController.getBasicColor());

            }
        };
        buuton.addMouseListener(ms);
        

    }

    public static void Book(itemMove panel, JPanel button, JLabel label, Movie n) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.out.println(panel.movie.getTitle());
                // ITEBest.lobby.showAddTicket(Database.movies.get(0));
                Lobby.PHome.setVisible(false);
                Lobby.ticketAdd.setVisible(true);
                Ticketadd.setValues(Lobby.ticketAdd, Database.movies.get(Database.movies.indexOf(n)));
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
        // panel.addMouseListener(ms);
    }

    public static void Exit(JPanel panel) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                System.exit(0);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

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
        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        };

    }
}
