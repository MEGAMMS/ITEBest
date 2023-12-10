package main.java.app.View;

import java.awt.BorderLayout;
// import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.PanelsController;
import main.java.app.Model.MainPanels;

public class Lobby extends JFrame {
    Home PHome = new Home();
    Profile PProfile = new Profile();
    Lobby() {
        initComponents();
    }
    
    
    private void MouseEnterPtoolbar(JPanel panel) {
        panel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                PanelsController.switchPanels(panel);
            }

            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                panel.setBackground(ColoringController.getLightBasicColor());
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                panel.setBackground(ColoringController.getBasicColor());

            }

        });

    }

    private void initComponents() {

        // -------------Head---------------
        JPanel Top = new JPanel();
        JLabel title = new JLabel("ITE Best");
        title.setBounds(600, 0, 300, 50);
        Top.setBounds(0, 0, 1280, 50);
        Top.setLayout(null);
        Top.setBackground(ColoringController.getBasicColor());
        title.setFont(FontController.getPrimaryFont(Font.BOLD, 30));
        title.setForeground(ColoringController.getWhiteColor());
        Top.add(title);
        // --------------------------------

        // -----------------toolbar----------------
        JPanel toolbar = new JPanel();
        toolbar.setBounds(0, 0, 60, 1000);
        toolbar.setBackground(ColoringController.getBasicColor());
        toolbar.setLayout(null);
        //
        JPanel BProfile = new JPanel();
        BProfile.setName("BProfile");
        BProfile.setLayout(new BorderLayout());
        BProfile.setBounds(0, 70, 60, 100);
        BProfile.add(ImageController.addPhoto("profile.png"), BorderLayout.CENTER);
        BProfile.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(BProfile);
        toolbar.add(BProfile);
        //
        JPanel BMovie = new JPanel();
        BMovie.setLayout(new BorderLayout());
        BMovie.setBounds(0, 170, 60, 100);
        BMovie.add(ImageController.addPhoto("movie.png"), BorderLayout.CENTER);
        BMovie.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(BMovie);
        toolbar.add(BMovie);
        //
        JPanel BTrend = new JPanel();
        BTrend.setLayout(new BorderLayout());
        BTrend.setBounds(0, 270, 60, 100);
        BTrend.add(ImageController.addPhoto("fire.png"), BorderLayout.CENTER);
        BTrend.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(BTrend);
        toolbar.add(BTrend);
        //
        JPanel BHome = new JPanel();
        BHome.setName("BHome");
        BHome.setLayout(new BorderLayout());
        BHome.setBounds(0, 370, 60, 100);
        BHome.add(ImageController.addPhoto("home.png"), BorderLayout.CENTER);
        BHome.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(BHome);
        toolbar.add(BHome);
        //
        JPanel Bticket = new JPanel();
        Bticket.setLayout(new BorderLayout());
        Bticket.setBounds(0, 470, 60, 100);
        Bticket.add(ImageController.addPhoto("ticket.png"), BorderLayout.CENTER);
        Bticket.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(Bticket);
        toolbar.add(Bticket);
        //
        JPanel BSettings = new JPanel();
        BSettings.setLayout(new BorderLayout());
        BSettings.setBounds(0, 570, 60, 100);
        BSettings.add(ImageController.addPhoto("setting.png"), BorderLayout.CENTER);
        BSettings.setBackground(ColoringController.getBasicColor());
        MouseEnterPtoolbar(BSettings);
        toolbar.add(BSettings);
        //
        // -----------------------------

        // ----------Properties------------
        setIconImage(ImageController.getITEBestIcon().getImage());
        setSize(1280, 720);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        MainPanels.addPanel(PHome);
        MainPanels.addPanel(PProfile);
        add(PHome);
        add(PProfile);
        PHome.setVisible(false);
        PProfile.setVisible(false);
        add(Top);
        add(toolbar);
        setVisible(true);
        // --------------------------------
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lobby();
            }
        });
    }
}
