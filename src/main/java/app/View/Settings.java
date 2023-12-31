package main.java.app.View;

import javax.swing.*;

import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Settings extends JPanel {

    public static int iSettings = 0;
    public JLabel SettingsLabel;
    public JLabel label;
    public JLabel label2;
    public JPanel panel;
    public JButton button;

    public JRadioButton theme_icon_button;
    public JRadioButton theme_icon_button2;
    public JRadioButton theme_icon_button3;
    public JRadioButton theme_icon_button4;
    public JRadioButton theme_icon_button5;
    public JRadioButton theme_icon_button6;
    public ArrayList<JRadioButton> radioButtons;
    public ButtonGroup group;

    Settings() {

        Timer timer = new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                MainFrame.PSettings.theme_icon_button.setBackground(ColoringController.getSecoundColorDark2());
                MainFrame.PSettings.theme_icon_button2.setBackground(ColoringController.getSecoundColorDark2());
                MainFrame.PSettings.theme_icon_button3.setBackground(ColoringController.getSecoundColorDark2());
                MainFrame.PSettings.theme_icon_button4.setBackground(ColoringController.getSecoundColorDark2());
                MainFrame.PSettings.theme_icon_button5.setBackground(ColoringController.getSecoundColorDark2());
                MainFrame.PSettings.theme_icon_button6.setBackground(ColoringController.getSecoundColorDark2());

            }

        });
        timer.start();
        // ________________________________________________________________________

        JLabel tSettings = new JLabel("Settings Page");
        tSettings.setBounds(10, 0, 300, 50);
        tSettings.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        tSettings.setForeground(ColoringController.getBlackColor());
        add(tSettings);

        setName("Settings");
        setBackground(ColoringController.getSecoundColorLight());
        this.setVisible(true);
        this.setLayout(null);
        // __________________________label 1___________________________________________
        label = new JLabel();
        label.setForeground(ColoringController.getWhiteColor());
        label.setBackground(ColoringController.getSecoundColorDark1());
        label.setOpaque(true);
        label.setText("جميع الحقوق محفوظة لـ 2024   ITEBest");
        label.setForeground(ColoringController.getBlackColor());
        label.setFont(new Font("", Font.BOLD, 20));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBounds(680, 560, 520, 100);
        this.add(label);
        // _______________________label2_______________________________
        label2 = new JLabel();
        label2.setForeground(ColoringController.getWhiteColor());
        label2.setBackground(ColoringController.getSecoundColorDark1());
        label2.setOpaque(true);
        label2.setText("To get in touch, please Contact our page.");
        label2.setForeground(ColoringController.getBlackColor());
        label2.setFont(new Font("", Font.BOLD, 18));
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setBounds(10, 560, 500, 100);
        this.add(label2);
        // _____________________SettingsLabel________________________________
        SettingsLabel = new JLabel(ImageController.getIcon("choosethemes.png", 500, 500));
        SettingsLabel.setBackground(ColoringController.getSecoundColorLight());
        SettingsLabel.setOpaque(true);
        SettingsLabel.setHorizontalAlignment(JLabel.CENTER);
        SettingsLabel.setVerticalAlignment(JLabel.CENTER);
        SettingsLabel.setBounds(10, 40, 1200, 500);
        this.add(SettingsLabel);
        // ______________________________panel___________________________________
        panel = new JPanel();
        setBounds(60, 50, 1220, 670);
        panel.setBounds(10, 50, 1200, 500);
        panel.setForeground(ColoringController.getWhiteColor());
        panel.setFont(new Font("", Font.BOLD, 32));
        panel.setBackground(ColoringController.getSecoundColorDark2());
        panel.setLayout(null);
        group = new ButtonGroup();

        theme_icon_button = addRadioButton("theme1.jpg", 90, 20);
        panel.add(theme_icon_button);
        PanelsController.addActionToRadio(theme_icon_button);
        theme_icon_button2 = addRadioButton("theme2.jpg", 440, 20);
        panel.add(theme_icon_button2);
        PanelsController.addActionToRadio(theme_icon_button2);
        theme_icon_button3 = addRadioButton("theme3.jpg", 790, 20);
        panel.add(theme_icon_button3);
        theme_icon_button4 = addRadioButton("theme4.jpg", 90, 260);
        panel.add(theme_icon_button4);
        theme_icon_button5 = addRadioButton("theme5.jpg", 440, 260);
        panel.add(theme_icon_button5);
        theme_icon_button6 = addRadioButton("theme6.jpg", 790, 260);
        panel.add(theme_icon_button6);
        panel.setVisible(false);

        this.add(panel);
        group.add(theme_icon_button);
        group.add(theme_icon_button2);
        group.add(theme_icon_button3);
        group.add(theme_icon_button4);
        group.add(theme_icon_button5);
        group.add(theme_icon_button6);
        radioButtons = new ArrayList<>();
        radioButtons.add(theme_icon_button);
        radioButtons.add(theme_icon_button2);
        radioButtons.add(theme_icon_button3);
        radioButtons.add(theme_icon_button4);
        radioButtons.add(theme_icon_button5);
        radioButtons.add(theme_icon_button6);
        radioButtons.get(Database.currTheme).setSelected(true);
        // theme_icon_button.setSelected(true);

        // ____________button_________________________________________________________-
        button = new JButton();
        // book.setBounds(540,600,200,50);
        button.setBounds(521, 570, 150, 80);
        PanelsController.addActionToButton(button, 0, "ChooseThemes");
        button.setFocusable(false);
        button.setText("Change theme");
        button.setFocusable(false);
        button.setBorder(null);
        button.setBackground(ColoringController.getFirstColorLight());
        button.setFont(new Font("", Font.BOLD, 16));
        button.setForeground(ColoringController.getBlackColor());
        this.add(button);
    }

    public JRadioButton addRadioButton(String img, int X, int Y) {
        JRadioButton rb = new JRadioButton(ImageController.getIcon(img, 320, 180));
        rb.setBounds(X, Y, 330, 220);
        PanelsController.addActionToRadio(rb);
        rb.setBackground(ColoringController.getSecoundColor());
        rb.setFocusable(false);
        rb.setBorder(null);
        return rb;
    }
}
