package main.java.app.View.MainViews;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;
import com.k33ptoo.components.KButton;
import java.awt.Font;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.ImageController;
import main.java.app.Controller.LabelController;
import main.java.app.Controller.PanelsController;
import main.java.app.Controller.Utils;
import main.java.app.Controller.DefaultDatabase.DefaultDatabase;

public class VisaCardAdd extends JPanel{
    public JFormattedTextField idCardText,password;
    KButton bCheckVisa;
    KButton bCancelAddVisa;
    public JLabel msgState;
    VisaCardAdd(){
        initComponents();
    }
    private void initComponents(){
        try {
            add(LabelController.addLabel("Add Visa Card",FontController.getSecondryFont(Font.BOLD, 32) , 10, 20, 570, 40));
            JLabel img2=ImageController.addPhoto("addVisa.png", 450, 300);
            img2.setBounds(100, 10, 400, 400);
            add(img2);
            //-----------Id Card-------------
            add(LabelController.addLabel("Enter Id Card: ",FontController.getSecondryFont(Font.BOLD, 20) , 40, 350, 140, 50));
            MaskFormatter maskFormatter = new MaskFormatter("####-####-####-####");
            idCardText = new JFormattedTextField(maskFormatter);
            idCardText.setBounds(190, 360, 320, 35);
            idCardText.setForeground(ColoringController.getBlackColor());
            idCardText.setBackground(ColoringController.getWhiteColor());
            idCardText.setHorizontalAlignment(SwingConstants.CENTER);
            idCardText.setFont(FontController.getSecondryFont(Font.BOLD, 20));
            add(idCardText);
            //-----------Password-------------
            add(LabelController.addLabel("Enter PIN Password: ",FontController.getSecondryFont(Font.BOLD, 20) , 40, 420, 200, 50));
            MaskFormatter maskFormatterPass = new MaskFormatter("####");
            password = new JFormattedTextField(maskFormatterPass);
            password.setBounds(300, 430, 100, 35);
            password.setHorizontalAlignment(SwingConstants.CENTER);
            password.setForeground(ColoringController.getBlackColor());
            password.setBackground(ColoringController.getWhiteColor());
            password.setFont(FontController.getSecondryFont(Font.BOLD, 20));
            add(password);

            msgState=LabelController.addLabel("", FontController.getSecondryFont(Font.CENTER_BASELINE, 16), 50, 480, 500, 40);
            msgState.setHorizontalAlignment(SwingConstants.LEFT);
            add(msgState);
            msgState.setVisible(false);
            bCheckVisa = new KButton();
            bCheckVisa.setBounds(80, 540, 150, 40);
            bCheckVisa.setText("Check");
            bCheckVisa.setBackground(ColoringController.getFirstColor());
            PanelsController.setKButtonlight(bCheckVisa,ColoringController.getGreenColor());
            PanelsController.addActionToKButton(bCheckVisa, "CheckVisa");
            add(bCheckVisa);
            bCancelAddVisa = new KButton();
            bCancelAddVisa.setText("Cancel");
            bCancelAddVisa.setBounds(400, 540, 150, 40);
            PanelsController.setKButtonlight(bCancelAddVisa,ColoringController.getRedColor());
            PanelsController.addActionToKButton(bCancelAddVisa, "Cancel addVisa");
            add(bCancelAddVisa);
            setBounds(610, 50, 590, 610);
            setBackground(ColoringController.getSecoundColorLight());
            setLayout(null);
        
        
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("Something went wrong");
            System.out.println("Restarting the app");
            new DefaultDatabase();
            Utils.restartApp();
        }
        
        
    }
}
class JPlaceholderTextField extends JTextField {
    private String placeholder;

    public JPlaceholderTextField(String placeholder) {
        this.placeholder = placeholder;
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (getText().isEmpty()) {
                    setForeground(Color.BLACK);
                    setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (getText().isEmpty()) {
                    setForeground(Color.GRAY);
                    setText(placeholder);
                }
            }
        });
        setForeground(Color.GRAY);
        setText(placeholder);
    }

    @Override
    public String getText() {
        String typed = super.getText();
        return typed.equals(placeholder) ? "" : typed;
    }
}

