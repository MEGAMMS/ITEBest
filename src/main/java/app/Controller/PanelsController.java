package main.java.app.Controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.app.View.MainFrame;
import main.java.app.View.MoviesListView;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import com.k33ptoo.components.KButton;

import main.java.app.ITEBest;
import main.java.app.Model.MainPanels;
import main.java.app.View.RoundedBorder;

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
                        MainFrame.toolbar.setVisible(false);
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
                        break;
                    case "chair":
                        System.out.println(button.getName());
                        break;
                    case "Tick":
                        MainFrame.toolbar.setVisible(false);
                        if (ITEBest.LoginState.equals("none")) {
                            switchPanels("Singup");
                        } else {
                            
                        }
                        break;
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
                if (action == "TicketAdd") {
                    // MovieCard.Btitel.setForeground(ColoringController.getWhiteColor());
                    return;
                } else if (action == "chair") {
                    button.setBackground(Color.decode("#B0A4A4"));
                    return;
                }
                button.setBackground(ColoringController.getLightBasicColor());

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                if (action == "chair") {
                    button.setBackground(Color.decode("#F3EEEA"));
                    return;
                }
                button.setBackground(ColoringController.getBasicColor());

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
    }

    public static void ChooseComboPanel(JComboBox<String> comboBox) {
        comboBox.addActionListener(e -> {
            MainFrame.PMoviesListView.refresh((String)comboBox.getSelectedItem());
        });
    }

    public static void addActionToLabel(JLabel button, String action) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                switch (action) {
                    case "TicketAdd":
                        int id = Integer.parseInt(button.getName());
                        MainFrame.PTicketAdd.updateData(id);
                        switchPanels("TicketAdd");
                        break;
                    default:
                        switchPanels(action);
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                button.setForeground(ColoringController.getBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                button.setForeground(Color.BLACK);

            }
        };
        button.addMouseListener(ms);

    }
public static void addActionToKButton(KButton button, String action) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                switch (action) {
                    case "Sign Up":
                        String name = MainFrame.PSignup.Tname.getText();
                        String email = MainFrame.PSignup.Temail.getText();
                        char[] passwordChars = MainFrame.PSignup.Tpass.getPassword();
                        String password = new String(passwordChars);
                        String state = UserController.AddUser(name, email, password);
                        System.out.println(state);
                        if(state.equals("Signed up successfully"))
                        {
                            MainFrame.PSignup.MsgError.setForeground(Color.decode("#65B741"));
                            ITEBest.LoginState="Signed";
                        }
                             
                        else MainFrame.PSignup.MsgError.setForeground(Color.decode("#B80000"));
                        MainFrame.PSignup.MsgError.setText(state);

                        if (name.equals("")) {

                            MainFrame.PSignup.NameError.setVisible(true);
                        } else {
                            MainFrame.PSignup.NameError.setVisible(false);
                        }
                        if (email.equals("")) {
                            MainFrame.PSignup.EmailError.setVisible(true);
                        } else {
                            MainFrame.PSignup.EmailError.setVisible(false);
                        }
                        if (password.equals("")) {
                            MainFrame.PSignup.PassError.setVisible(true);
                        } else {
                            MainFrame.PSignup.PassError.setVisible(false);
                        }
                        break;
                        case "Cancel":
                            switchPanels("Home");
                            MainFrame.toolbar.setVisible(true);
                        break;
                    default:
                        
                        break;
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                button.setForeground(ColoringController.getBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                button.setForeground(Color.BLACK);

            }
        };
        button.addMouseListener(ms);

    }
}
