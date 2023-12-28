package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.Database;
import main.java.app.Model.Tags;

public class TicketManager extends JPanel {
    // identifications
    public static JPanel mainPanel;

    public TicketManager() {
        initComponents();
    }

    private void initComponents() {
        this.setName("TicketManager");
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(ColoringController.getWhiteColor());
        // ----------Top-------------
        JPanel Top = new JPanel();
        Top.setBackground(ColoringController.getTowColorLigth());
        Top.setBounds(10, 10, 1180, 35);
        Top.setLayout(null);

        JLabel tMovie = new JLabel("My tickets");
        tMovie.setBounds(510, 0, 300, 35);
        tMovie.setFont(FontController.getPrimaryFont(Font.BOLD, 29));
        Top.add(tMovie);
        // ---------------------------
        // -----------Body------------
       
        // ---------------------------
        // ---------------------------
        mainPanel.add(Top);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        setLayout(new BorderLayout());
        setBounds(58, 49, 1224, 700);
        add(scrollPane, BorderLayout.CENTER);
    }

    

}
