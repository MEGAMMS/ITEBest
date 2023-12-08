package main.java.app.View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Lobby extends JFrame{
    Home Phome=new Home();
    Profile PProfile=new Profile();
    Lobby(){
        initComponents();
    }
    private JLabel Photo(String imagePath){
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image resizedImage = imageIcon.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        JLabel imageLabel = new JLabel(resizedImageIcon);
        return imageLabel;
    }


    private void MouseEnterPtoolbar(JPanel panel){
            panel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                switch (panel.getName()) {
                    case "Home":
                        Phome.setVisible(true);
                        PProfile.setVisible(false);
                        break;
                    case "Profile":
                        Phome.setVisible(false);
                        PProfile.setVisible(true);
                        break;
                    default:
                    Phome.setVisible(false);
                    PProfile.setVisible(false);
                        break;
                }
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
                panel.setBackground(Color.decode("#D17292"));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                panel.setBackground(Color.decode("#860A35"));
    
            }
            
        });

    }
    private void initComponents() {
        setSize(1280,720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        Font f20 = new Font("Arial", Font.BOLD, 30);
        JPanel toolbar=new JPanel();
        JPanel Top=new JPanel();
        JLabel title=new JLabel("ITE Best");
        
        //-----------------toolbar----------------
        
        JPanel BProfile=new JPanel();
        BProfile.setName("Profile");
        BProfile.setLayout(new BorderLayout());
        BProfile.setBounds(0, 70, 60, 100);
        BProfile.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\profile.png"),BorderLayout.CENTER);
        BProfile.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(BProfile);
        toolbar.add(BProfile);
        //
         //
        JPanel BMovie=new JPanel();
        BMovie.setLayout(new BorderLayout());
        BMovie.setBounds(0, 170, 60, 100);
        BMovie.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\movie.png"),BorderLayout.CENTER);
        BMovie.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(BMovie);
        toolbar.add(BMovie);
        //
          //
        JPanel Btrend=new JPanel();
        Btrend.setLayout(new BorderLayout());
        Btrend.setBounds(0, 270, 60, 100);
        Btrend.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\fire.png"),BorderLayout.CENTER);
        Btrend.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(Btrend);
        toolbar.add(Btrend);
        //
        //
        JPanel BHome=new JPanel();
        BHome.setName("Home");
        BHome.setLayout(new BorderLayout());
        BHome.setBounds(0, 370, 60, 100);
        BHome.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\home.png"),BorderLayout.CENTER);
        BHome.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(BHome);
        toolbar.add(BHome);
        //
        //
        JPanel Bticket=new JPanel();
        Bticket.setLayout(new BorderLayout());
        Bticket.setBounds(0, 470, 60, 100);
        Bticket.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\ticket.png"),BorderLayout.CENTER);
        Bticket.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(Bticket);
        toolbar.add(Bticket);
        //
         //
        JPanel Bsettings=new JPanel();
        Bsettings.setLayout(new BorderLayout());
        Bsettings.setBounds(0, 570, 60, 100);
        Bsettings.add(Photo("D:\\Univercity\\Years\\ITE Second Year\\الفصل الاول\\برمجة 3\\project\\setting.png"),BorderLayout.CENTER);
        Bsettings.setBackground(Color.decode("#860A35"));
        MouseEnterPtoolbar(Bsettings);
        toolbar.add(Bsettings);
        //
        //----------------------------------
        //----------Pages--------------
        add(Phome);
        add(PProfile);
        Phome.setVisible(false);
        PProfile.setVisible(false);

        //----------------------------------


        title.setBounds(600, 0, 300, 50);
        Top.setLayout(null);
        setUndecorated(true);
        toolbar.setBounds(0, 0, 60, 1000);
        Top.setBounds(0, 0, 1280, 50);
        toolbar.setBackground(Color.decode("#860A35"));
        Top.setBackground(Color.decode("#860A35"));
        toolbar.setLayout(null);
        title.setFont(f20);
        title.setForeground(Color.WHITE);
        Top.add(title);
        add(Top);
        add(toolbar);


        setVisible(true);
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
