package main.java.app.Model;

import java.util.ArrayList;
import javax.swing.JPanel;

public class MainPanels {
    static public ArrayList<JPanel> Panels = new ArrayList<JPanel>();

    static public void addPanel(JPanel panel) {
        Panels.add(panel);
    }
}
