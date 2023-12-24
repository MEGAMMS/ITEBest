package main.java.app.Controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.app.View.Home;
import main.java.app.View.MainFrame;
import main.java.app.View.MoviesListView;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.k33ptoo.components.KButton;

import main.java.app.ITEBest;
import main.java.app.Model.Database;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Movie;
import main.java.app.View.RoundedBorder;
import main.java.app.View.TicketAdd;
import main.java.app.View.MovieCard;

public class PanelsController {
    public static Border roundedBorder(int n) {
        return new RoundedBorder(n);
    }

    public static void setButtonN(KButton kButton) {
        kButton.setkAllowGradient(false);
        kButton.setFont(FontController.getSecondryFont(Font.BOLD, 22));
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
        }
    }

    public static void addActionToButton(JPanel button, String action) {

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
                    case "TicketAdd":
                        int id = Integer.parseInt(button.getName());
                        MainFrame.PTicketAdd.updateData(id);
                        switchPanels("TicketAdd");

                    default:
                        switchPanels(action);
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
                if(action =="TicketAdd"){
                    MainFrame.PTicketAdd.titleM.setForeground(ColoringController.getWhiteColor());
                    return;
                }
                button.setBackground(ColoringController.getLightBasicColor());
                
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                if(action!="TicketAdd")
                    button.setBackground(ColoringController.getBasicColor());
                else{
                    MainFrame.PTicketAdd.titleM.setForeground(ColoringController.getBasicColor());
                }

            }
        };
        button.addMouseListener(ms);

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

    public static void ChooseComboPanel(JComboBox comboBox) {
        comboBox.addActionListener(e -> {
            String selectedValue = (String) comboBox.getSelectedItem();
            switch (selectedValue) {
                case "sadness":
                    MoviesListView.VisiblePanel(MoviesListView.sadness);
                    MoviesListView.sizeP = MoviesListView.sadness.getHeight();
                    MoviesListView.mainPanel.setPreferredSize(new Dimension(1224, MoviesListView.sizeP + 80));
                    break;
                case "All":
                    MoviesListView.VisiblePanel(MoviesListView.All);
                    MoviesListView.sizeP = MoviesListView.All.getHeight();
                    MoviesListView.mainPanel.setPreferredSize(new Dimension(1224, MoviesListView.sizeP + 80));
                    break;
                case "farcical":
                    MoviesListView.VisiblePanel(MoviesListView.farcical);
                    MoviesListView.sizeP = MoviesListView.farcical.getHeight();
                    MoviesListView.mainPanel.setPreferredSize(new Dimension(1224, MoviesListView.sizeP + 80));
                    break;
                case "action":
                    MoviesListView.VisiblePanel(MoviesListView.action);
                    MoviesListView.sizeP = MoviesListView.action.getHeight();
                    MoviesListView.mainPanel.setPreferredSize(new Dimension(1224, MoviesListView.sizeP + 80));
                    break;
                case "adventure":
                    MoviesListView.VisiblePanel(MoviesListView.adventure);
                    MoviesListView.sizeP = MoviesListView.adventure.getHeight();
                    MoviesListView.mainPanel.setPreferredSize(new Dimension(1224, MoviesListView.sizeP + 80));
                    break;
                default:
                    break;
            }
        });
    }

}
