package main.java.app.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.xml.crypto.Data;

import com.kitfox.svg.Font;

import main.java.app.Controller.AnimatedPanel;
import main.java.app.Controller.ColoringController;
import main.java.app.Controller.FontController;
import main.java.app.Controller.LabelController;
import main.java.app.Model.Comment;
import main.java.app.Model.Database;
import main.java.app.Model.Movie;

public class CommentsMovie extends JPanel{
    public Movie movie;
    public JTextField commentTextField = new JTextField();
    private  JTextPane commentsTextPane;
    CommentsMovie(Movie movie){
        this.movie=movie;
        initComponents();
    }
    public  void updateTextPane(Movie movie) {
        this.movie=movie;
        commentsTextPane.setText("");
        if(movie.comments.size()!=0)
            for(Comment c:movie.comments)
                addComment(c.msg);
    }   
    private void initComponents(){

        commentsTextPane = new JTextPane();
        commentsTextPane.setBounds(0,0,780,270);
        commentsTextPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(commentsTextPane);
        scrollPane.setBounds(0,0,780,270);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        commentTextField.setBounds(5,0,595,40);
        commentTextField.setFont(FontController.getSecondryFont(java.awt.Font.BOLD, 18));
        AnimatedPanel sendComment=new AnimatedPanel("Send Comment", 600, 0, 180, 40);
        sendComment.setBackground(ColoringController.getTowColorPanel());
        sendComment.add(LabelController.addLabel("Send Comment",FontController.getSecondryFont(java.awt.Font.BOLD, 18)));
        JPanel controlsPanel = new JPanel();
        controlsPanel.setLayout(null);
        controlsPanel.add(commentTextField);
        controlsPanel.add(sendComment);
        controlsPanel.setBackground(ColoringController.getTowColorPanel());
        controlsPanel.setBounds(0,275, 780, 40);
        add(controlsPanel);
        setBounds(10, 280, 780, 320);
        setBackground(ColoringController.getTowColorPanel());
        setLayout(null);
        add(scrollPane);
        add(controlsPanel);
    }
    public  void addComment(String comment) {
        StyledDocument doc = commentsTextPane.getStyledDocument();
        String name=Database.currUser.getName();
        SimpleAttributeSet nameAttrs = new SimpleAttributeSet();
        StyleConstants.setFontFamily(nameAttrs, "Arial");
        StyleConstants.setFontSize(nameAttrs, 18);
        StyleConstants.setBold(nameAttrs, true);
        StyleConstants.setForeground(nameAttrs, ColoringController.getTowColorDark());

        SimpleAttributeSet commentAttrs = new SimpleAttributeSet();
        StyleConstants.setFontFamily(commentAttrs, "Arial");
        StyleConstants.setFontSize(commentAttrs, 18);
        StyleConstants.setItalic(commentAttrs, true);
        StyleConstants.setForeground(commentAttrs, ColoringController.getBlackColor());
        
        try {
            doc.insertString(doc.getLength(), name + " |  ", nameAttrs);
            doc.insertString(doc.getLength(), comment + "\n", commentAttrs);
            
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
