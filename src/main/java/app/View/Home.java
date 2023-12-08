package main.java.app.View;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Home extends JFrame{
    Home(){
        initComponents();
    }

    private void MouseEnterPtoolbar(JPanel panel){
            panel.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
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

        JPanel toolbar=new JPanel();
        JPanel Top=new JPanel();
        JPanel BProfile=new JPanel();

        MouseEnterPtoolbar(BProfile);
        setUndecorated(true);
        toolbar.setBounds(0, 0, 60, 1000);
        Top.setBounds(0, 0, 1280, 50);
        BProfile.setBounds(0, 0, 40, 50);
        BProfile.setBackground(Color.decode("#860A35"));
        toolbar.setBackground(Color.decode("#860A35"));
        Top.setBackground(Color.decode("#860A35"));
        toolbar.setLayout(new GridLayout(6,1));
        toolbar.add(BProfile);
        add(toolbar);
        add(Top);


        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Home();
            }
        });
    }
}
