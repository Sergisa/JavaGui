package com.company;

import javax.swing.*;

public class MainForm extends JFrame {
    private JPanel root;
    private JButton clickMeButton;
    private JTextField textField1;
    private JLabel textLabel;
    private IncreasingLabel increasingLabel1;

    public MainForm() {
        setVisible(true);
        setContentPane(root);
        setSize(300, 300);
        textLabel.setText("Hello world");
        clickMeButton.setText("Would you click me?!");
        setTitle("MyTitle");
        increasingLabel1.setText("wef");
        increasingLabel1.increaseFontSize(10);

    }

    private void createUIComponents(){
        increasingLabel1 = new IncreasingLabel();
    }
}
