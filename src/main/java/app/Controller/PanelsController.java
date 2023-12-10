package main.java.app.Controller;

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
}
