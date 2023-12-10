package main.java.app.Controller;

import javax.swing.JPanel;

import main.java.app.Model.MainPanels;
public class PanelsController {
    public void SwichPanels(JPanel Panel){
        for(JPanel p : MainPanels.Panels){
            p.setVisible(p.getName() == Panel.getName());
        }   
    }
}
