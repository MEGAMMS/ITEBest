package main.java.app.Controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import main.java.app.View.MainFrame;
import main.java.app.View.MovieView.Settings;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.k33ptoo.components.KButton;

import main.java.app.Model.Comment;
import main.java.app.Model.Database;
import main.java.app.Model.MainPanels;
import main.java.app.Model.Showtime;

public class PanelsController {
    public static JPanel roundedBorder(int n) {
        return new RoundedPanel(n);
    }

    public static void setKButtonDark(KButton kButton) {
        kButton.setkAllowGradient(false);
        kButton.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        kButton.setkBackGroundColor(ColoringController.getFirstColorDark());
        kButton.setkForeGround(ColoringController.getWhiteColor());
        kButton.setkHoverColor(ColoringController.getWhiteColor());
        kButton.setkPressedColor(ColoringController.getFirstColorLight());
        kButton.setkSelectedColor(ColoringController.getFirstColorDark());
        kButton.setkHoverForeGround(ColoringController.getFirstColorDark());
        kButton.setBorder(null);
        kButton.setkFillButton(true);
        kButton.setkBorderRadius(30);
        kButton.setkIndicatorThickness(2);
        kButton.setkIndicatorColor(ColoringController.getBlackColor());
    }

    public static void setKButtonlight(KButton kButton, Color color) {
        kButton.setkAllowGradient(false);
        kButton.setFont(FontController.getSecondryFont(Font.BOLD, 22));
        kButton.setkBackGroundColor(ColoringController.getWhiteColor());
        kButton.setForeground(color);
        kButton.setkForeGround(color);
        kButton.setkHoverColor(color);
        kButton.setkPressedColor(color);
        kButton.setkSelectedColor(ColoringController.getWhiteColor());
        kButton.setkHoverForeGround(ColoringController.getWhiteColor());
        kButton.setBorder(null);
        kButton.setkFillButton(true);
        kButton.setkBorderRadius(30);
        kButton.setkIndicatorThickness(2);
        kButton.setkIndicatorColor(ColoringController.getBlackColor());
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
                switch (action) {
                    case "Settings":
                        switchPanels("Settings");
                        break;
                    case "Profile":
                        if (!Utils.isLogedIn()) {
                            MainFrame.toolbar.setVisible(false);
                            switchPanels("Login");
                        } else {
                            MainFrame.toolbar.setVisible(true);
                            MainFrame.PProfile.updateData(Database.currUser);
                            if (Database.currUser.creditcard == null) {
                                MainFrame.PProfile.dontPayM.setVisible(true);
                                MainFrame.PProfile.right.setVisible(false);
                                MainFrame.PProfile.addVisaCard.setVisible(false);
                            } else {
                                MainFrame.PProfile.dontPayM.setVisible(false);
                                MainFrame.PProfile.right.setVisible(true);
                                MainFrame.PProfile.addVisaCard.setVisible(false);
                            }
                            switchPanels("Profile");
                        }
                        break;
                    case "Close":
                        MainFrame.PTicketAdd.MsgError.setVisible(false);
                        switchPanels("Home");
                        break;
                    case "TicketAdd":

                        int id = Integer.parseInt(button.getName());
                        MainFrame.PTicketAdd.updateData(Database.movies.get(id));

                        MainFrame.PTicketAdd.MsgError.setVisible(false);
                        switchPanels("TicketAdd");
                        break;
                    case "Tick":

                        if (!Utils.isLogedIn()) {
                            MainFrame.toolbar.setVisible(false);
                            switchPanels("Singup");
                        } else {

                            int count = Integer.parseInt(MainFrame.PTicketAdd.numTick.getValue().toString());
                            Showtime showtime = MainFrame.PTicketAdd.movie.showtimes
                                    .get(MainFrame.PTicketAdd.comboBoxShowtime.getSelectedIndex());
                            // System.out.println(showtime);
                            String stateTick = TicketController.Book(MainFrame.PTicketAdd.movie, Database.currUser,
                                    count, showtime);
                            MainFrame.PTicketAdd.MsgError.setText(stateTick);
                            MainFrame.PTicketAdd.MsgError.setForeground(ColoringController.getRedColor());
                            MainFrame.PTicketAdd.MsgError.setVisible(true);
                            if (stateTick.equals("Booked successfully")) {
                                MainFrame.PTicketAdd.MsgError.setVisible(true);
                                System.out.println(stateTick);
                                MainFrame.PTicketAdd.MsgError.setForeground(ColoringController.getGreenColor());
                                MainFrame.PTicketAdd.numberTicketFree.setText(
                                        "Number Ticket Free " + MainFrame.PTicketAdd.SelectedShowtime.getSeats());
                                MainFrame.PTicketAdd.MsgError.setVisible(false);
                                MainFrame.PTicketManager.refresh();
                                switchPanels("TicketManager");
                            }
                        }
                        break;
                    case "ViewPanelTickInfo":
                        if (Utils.isLogedIn()) {
                            MainFrame.PTicketAdd.BookingPanel.setVisible(true);
                            MainFrame.PTicketAdd.checkLogin.setVisible(false);
                        } else {
                            MainFrame.PTicketAdd.checkLogin.setVisible(true);
                            MainFrame.PTicketAdd.BookingPanel.setVisible(false);
                        }

                        MainFrame.PTicketAdd.CommentsPanel.setVisible(false);
                        break;
                    case "ViewPanelComments":
                        if (Utils.isLogedIn()) {
                            MainFrame.PTicketAdd.CommentsPanel.commentTextField.setEditable(true);
                        } else {
                            MainFrame.PTicketAdd.CommentsPanel.commentTextField.setEditable(false);
                        }
                        MainFrame.PTicketAdd.checkLogin.setVisible(false);
                        MainFrame.PTicketAdd.CommentsPanel.setVisible(true);
                        MainFrame.PTicketAdd.BookingPanel.setVisible(false);
                        break;
                    case "Send Comment":
                        String comment = MainFrame.PTicketAdd.CommentsPanel.commentTextField.getText().trim();
                        if (comment.length() != 0) {
                            MainFrame.PTicketAdd.CommentsPanel.addComment(Database.currUser.getName(), comment);
                            MainFrame.PTicketAdd.CommentsPanel.movie.comments
                                    .add(new Comment(Database.currUser.getName(), comment));
                            // System.out.println(MainFrame.PTicketAdd.CommentsPanel.movie.getTitle());
                            Database.save();
                        }

                        // Database.saveMovies();
                        MainFrame.PTicketAdd.CommentsPanel.commentTextField.setText("");
                        break;
                    case "TicketManager":
                        if (Utils.isLogedIn()) {
                            MainFrame.PTicketManager.refresh();
                            switchPanels(action);
                        } else {
                            MainFrame.toolbar.setVisible(false);
                            switchPanels("Login");
                        }
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
                if (action == "TicketAdd") {
                    // MovieCard.Btitel.setForeground(ColoringController.getWhiteColor());
                    return;
                }
                if (action == "ViewPanelTickInfo" || action == "ViewPanelComments") {
                    button.setBackground(ColoringController.getSecoundColorDark1());
                    return;
                }
                if (action == "Send Comment") {
                    return;
                }
                button.setBackground(ColoringController.getFirstColorLight());

            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                if (action == "ViewPanelTickInfo" || action == "ViewPanelComments") {
                    button.setBackground(ColoringController.getSecoundColorLight());
                    return;
                }
                if (action == "Send Comment") {
                    return;
                }
                button.setBackground(ColoringController.getFirstColorDark());

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
                panel.setBackground(ColoringController.getFirstColorLight());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                panel.setBackground(ColoringController.getFirstColorDark());

            }
        };
        panel.addMouseListener(ms);
    }

    public static void ChooseComboPanel(JComboBox<String> comboBox) {
        comboBox.addActionListener(e -> {
            MainFrame.PMoviesListView.refresh((String) comboBox.getSelectedItem());
        });
    }

    public static void ChooseComboShowTimes(JComboBox<String> comboBox) {
        comboBox.addActionListener(e -> {
            // System.out.println(comboBox.getSelectedItem());
            Showtime SelectedShowtime = MainFrame.PTicketAdd.movie.showtimes.stream()
                    .filter(obj -> obj.toString().equals((String) comboBox.getSelectedItem())).findFirst().orElse(null);
            // System.out.println(SelectedShowtime);
            MainFrame.PTicketAdd.numberTicketFree.setText("Number Ticket Free " + SelectedShowtime.getSeats());
            // MainFrame.PTicketAdd.updateData(MainFrame.PTicketAdd.movie.getId());
            // MainFrame.PTicketAdd.numberTicketFree.setText("Number Ticket Free " +
            // showtime.getSeats());
        });
    }

    public static void ChooseSpinner(JSpinner spinner) {
        spinner.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int spinnerValue = (int) spinner.getValue();
                int totalPrice = MainFrame.PTicketAdd.movie.getPrice() * spinnerValue;
                MainFrame.PTicketAdd.priceAll.setText("Total Price: " + Integer.toString(totalPrice) + " S.P");
            }
        });
    }

    public static void addActionToLabel(JLabel button, String action) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                switch (action) {
                    case "TicketAdd":
                        int id = Integer.parseInt(button.getName());
                        MainFrame.PTicketAdd.updateData(Database.movies.get(id));
                        MainFrame.PTicketAdd.MsgError.setVisible(false);
                        if (!Utils.isLogedIn()) {
                            MainFrame.PTicketAdd.BookingPanel.setVisible(false);
                            MainFrame.PTicketAdd.checkLogin.setVisible(true);
                            MainFrame.PTicketAdd.addTick.setVisible(false);
                        } else {
                            MainFrame.PTicketAdd.BookingPanel.setVisible(true);
                            MainFrame.PTicketAdd.checkLogin.setVisible(false);
                            MainFrame.PTicketAdd.addTick.setVisible(true);
                        }
                        switchPanels("TicketAdd");
                        break;
                    case "Login":
                        MainFrame.PSignup.Tname.setText("");
                        MainFrame.PSignup.Temail.setText("");
                        MainFrame.PSignup.Tpass.setText("");
                        MainFrame.PSignup.EmailError.setVisible(false);
                        MainFrame.PSignup.NameError.setVisible(false);
                        MainFrame.PSignup.MsgError.setVisible(false);
                        MainFrame.PSignup.PassError.setVisible(false);
                        switchPanels("Login");
                        break;
                    case "Signup":
                        MainFrame.PLogin.TEmail.setText("");
                        MainFrame.PLogin.TPass.setText("");
                        MainFrame.PLogin.EmailError.setVisible(false);
                        MainFrame.PLogin.MsgError.setVisible(false);
                        MainFrame.PLogin.PassError.setVisible(false);
                        switchPanels("Singup");
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
                if (action.equals("Login") || action.equals("Signup")) {
                    button.setForeground(ColoringController.getFirstColorLight());
                    return;
                }
                button.setForeground(ColoringController.getFirstColorDark());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                if (action.equals("Login") || action.equals("Signup")) {
                    button.setForeground(ColoringController.getFirstColorDark());
                    return;
                }
                button.setForeground(ColoringController.getBlackColor());

            }
        };
        button.addMouseListener(ms);

    }

    public static void addActionToKButton(KButton button, String action) {

        MouseListener ms = new MouseListener() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                switch (action) {
                    case "CheckVisa":
                        String idCard = MainFrame.PProfile.addVisaCard.idCardText.getText();
                        String stateAddVisa = VisaController.addvisacard(idCard,
                                MainFrame.PProfile.addVisaCard.password.getText(), Database.currUser);
                        MainFrame.PProfile.addVisaCard.msgState.setForeground(ColoringController.getRedColor());
                        MainFrame.PProfile.addVisaCard.msgState.setVisible(true);
                        MainFrame.PProfile.addVisaCard.msgState.setText(stateAddVisa);
                        if (stateAddVisa.equals("succeccfully added your card")) {
                            MainFrame.PProfile.addVisaCard.msgState.setForeground(ColoringController.getGreenColor());
                            MainFrame.PProfile.updateData(Database.currUser);
                            MainFrame.PProfile.addVisaCard.setVisible(false);
                            MainFrame.PProfile.dontPayM.setVisible(false);
                            MainFrame.PProfile.right.setVisible(true);
                        }
                        MainFrame.PProfile.addVisaCard.idCardText.setText("");
                        MainFrame.PProfile.addVisaCard.password.setText("");

                        break;
                    case "Log out":
                        Database.currUser = null;
                        Database.save();
                        MainFrame.toolbar.setVisible(false);
                        switchPanels("Login");
                        break;
                    case "Regecter":
                        MainFrame.toolbar.setVisible(false);
                        switchPanels("Login");
                        break;
                    case "Sign Up":
                        String name = MainFrame.PSignup.Tname.getText();
                        String email = MainFrame.PSignup.Temail.getText();
                        char[] passwordChars = MainFrame.PSignup.Tpass.getPassword();
                        String password = new String(passwordChars);
                        String state = UserController.AddUser(name, email, password);
                        MainFrame.PSignup.MsgError.setVisible(true);
                        MainFrame.PSignup.MsgError.setText(state);
                        if (state.equals("Signed up successfully")) {
                            MainFrame.PSignup.MsgError.setForeground(ColoringController.getGreenColor());
                            MainFrame.PSignup.Tname.setText("");
                            MainFrame.PSignup.Temail.setText("");
                            MainFrame.PSignup.Tpass.setText("");
                        } else {
                            MainFrame.PSignup.MsgError.setForeground(ColoringController.getRedColor());

                        }

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
                    case "Cancel Login":
                        MainFrame.PLogin.TEmail.setText("");
                        MainFrame.PLogin.TPass.setText("");
                        MainFrame.PLogin.EmailError.setVisible(false);
                        MainFrame.PLogin.MsgError.setVisible(false);
                        MainFrame.PLogin.PassError.setVisible(false);

                        switchPanels("Home");
                        MainFrame.toolbar.setVisible(true);
                        break;
                    case "Cancel addVisa":
                        MainFrame.PProfile.addVisaCard.idCardText.setText("");
                        MainFrame.PProfile.addVisaCard.password.setText("");
                        MainFrame.PProfile.addVisaCard.msgState.setVisible(false);
                        MainFrame.PProfile.addVisaCard.setVisible(false);
                        if (Database.currUser.creditcard == null)
                            MainFrame.PProfile.dontPayM.setVisible(true);
                        break;
                    case "AddVisaCard":
                        MainFrame.PProfile.dontPayM.setVisible(false);
                        MainFrame.PProfile.addVisaCard.setVisible(true);
                        break;
                    case "Cancel Signup":
                        MainFrame.PSignup.Tname.setText("");
                        MainFrame.PSignup.Temail.setText("");
                        MainFrame.PSignup.Tpass.setText("");
                        MainFrame.PSignup.EmailError.setVisible(false);
                        MainFrame.PSignup.NameError.setVisible(false);
                        MainFrame.PSignup.MsgError.setVisible(false);
                        MainFrame.PSignup.PassError.setVisible(false);
                        switchPanels("Home");
                        MainFrame.toolbar.setVisible(true);
                        break;
                    case "Login":
                        String emailL = MainFrame.PLogin.TEmail.getText();
                        char[] passwordCharsL = MainFrame.PLogin.TPass.getPassword();
                        String passwordL = new String(passwordCharsL);
                        String stateL = UserController.LogIn(emailL, passwordL);
                        MainFrame.PLogin.MsgError.setText(stateL);
                        MainFrame.PLogin.MsgError.setVisible(true);
                        if (emailL.equals("")) {

                            MainFrame.PLogin.EmailError.setVisible(true);
                        } else {
                            MainFrame.PLogin.EmailError.setVisible(false);
                        }
                        if (passwordL.equals("")) {
                            MainFrame.PLogin.PassError.setVisible(true);
                        } else {
                            MainFrame.PLogin.PassError.setVisible(false);
                        }
                        if (stateL.equals("Welcome")) {
                            MainFrame.PLogin.MsgError.setForeground(ColoringController.getGreenColor());
                            MainFrame.PLogin.MsgError.setVisible(false);
                            MainFrame.toolbar.setVisible(true);
                            switchPanels("Profile");

                            MainFrame.PLogin.TEmail.setText("");
                            MainFrame.PLogin.TPass.setText("");
                        } else
                            MainFrame.PLogin.MsgError.setForeground(ColoringController.getRedColor());

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
                if (action.equals("Log out")) {
                    return;
                }
                button.setForeground(ColoringController.getFirstColorDark());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                button.setForeground(ColoringController.getBlackColor());

            }
        };
        button.addMouseListener(ms);

    }

    public static void addActionToButton(JButton button, int n, String action) {

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (action.equals("ChooseThemes")) {
                    MainFrame.PSettings.SettingsLabel.setVisible(false);
                    Settings.iSettings += 1;
                    MainFrame.PSettings.panel.setVisible(true);
                    if (Settings.iSettings % 2 == 0) {
                        MainFrame.PSettings.panel.setVisible(false);
                        MainFrame.PSettings.SettingsLabel.setVisible(true);
                    }
                }
            }
        });

    }

    public static void addActionToRadio(JRadioButton radioButton1) {

        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (radioButton1.isSelected()) {
                    Database.currTheme = MainFrame.PSettings.radioButtons.indexOf(radioButton1);
                    Database.save();
                    Utils.restart();
                }
            }
        });
    }
}
