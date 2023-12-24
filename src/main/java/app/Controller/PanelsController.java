package main.java.app.Controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.app.View.Home;
import main.java.app.View.Lobby;
import main.java.app.View.MoviesView;

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
import main.java.app.View.Ticketadd;
import main.java.app.View.itemMove;

public class PanelsController {
    public static Border roundedBorder(int n){
        return new RoundedBorder(n);
    }

    public static void setButtonN(KButton kButton){
        kButton.setkAllowGradient(false);
        kButton.setFont(FontController.Roboto(Font.BOLD, 22));
        kButton.setkBackGroundColor(ColoringController.getBasicColor());
        kButton.setkForeGround(ColoringController.getWhiteColor());
        kButton.setkHoverColor(ColoringController.getWhiteColor());
        kButton.setkPressedColor(ColoringController.getLightBasicColor());
        kButton.setkSelectedColor(ColoringController.getBasicColor());;
        kButton.setkHoverForeGround(ColoringController.getBasicColor());
        kButton.setBorder(null);
        kButton.setkFillButton(true);
        kButton.setkBorderRadius(30);
        kButton.setkIndicatorThickness(2);
        kButton.setkIndicatorColor(Color.BLACK);
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
                        VisiblePanelHome(Lobby.PHome);
                        break;
                    case "Profile":
                        Lobby.PHome.setVisible(false);
                        Lobby.ticketadd.setVisible(false);
                        Lobby.login.setVisible(false);
                        if(ITEBest.LoginnState.equals("none")){
                            Lobby.singup.setVisible(true);
                        }else{
                            Lobby.PProfile.setVisible(true);
                        }
                        

                    break;
                    case "Close":
                        Lobby.PHome.setVisible(true);
                        Lobby.PProfile.setVisible(false);
                        Lobby.ticketadd.setVisible(false);
                        Lobby.singup.setVisible(false);
                    break;
                    case "Movies":
                        VisiblePanelHome(Lobby.moviesView);
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
                VisiblePanelHome(Lobby.ticketadd);
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


     public static void  Exit(JPanel panel) {

        
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
        ActionListener al=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        };
       
    }
    public static void ChooseComboPanel(JComboBox comboBox){
        comboBox.addActionListener(e -> {
            String selectedValue = (String) comboBox.getSelectedItem();
            switch (selectedValue) {
                case "sadness":
                    MoviesView.VisiblePanel(MoviesView.sadness);
                    MoviesView.sizeP=MoviesView.sadness.getHeight();
                    MoviesView.mainPanel.setPreferredSize(new Dimension(1224,MoviesView.sizeP+80));
                    break;
                case "All":
                    MoviesView.VisiblePanel(MoviesView.All);
                    MoviesView.sizeP=MoviesView.All.getHeight();
                    MoviesView.mainPanel.setPreferredSize(new Dimension(1224,MoviesView.sizeP+80));
                    break;
                case "farcical":
                    MoviesView.VisiblePanel(MoviesView.farcical);
                    MoviesView.sizeP=MoviesView.farcical.getHeight();
                    MoviesView.mainPanel.setPreferredSize(new Dimension(1224,MoviesView.sizeP+80));
                    break;
                case "action":
                    MoviesView.VisiblePanel(MoviesView.action);
                    MoviesView. sizeP=MoviesView.action.getHeight();
                    MoviesView.mainPanel.setPreferredSize(new Dimension(1224,MoviesView.sizeP+80));
                    break;
                case "adventure":
                    MoviesView.VisiblePanel(MoviesView.adventure);
                    MoviesView.sizeP=MoviesView.adventure.getHeight();
                    MoviesView.mainPanel.setPreferredSize(new Dimension(1224,MoviesView.sizeP+80));
                    break;
                default:
                    break;
            }
        });
    }
    public static void VisiblePanelHome(JPanel panel){
        Lobby.PHome.setVisible(false);
        Lobby.PProfile.setVisible(false);
        Lobby.ticketadd.setVisible(false);
        Lobby.singup.setVisible(false);
        Lobby.login.setVisible(false);
        Lobby.moviesView.setVisible(false);
        panel.setVisible(true);
    }
}
