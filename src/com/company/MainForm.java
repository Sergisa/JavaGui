package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MainForm extends JFrame {
    private JPanel root;
    private JButton clickMeButton;
    private JTextField searchValue;
    private JLabel label;
    private String[] searchableData;

    public MainForm() {
        setVisible(true);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        clickMeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String currentString : searchableData) {
                    if(currentString.equalsIgnoreCase(searchValue.getText())){
                        setCheck();
                    }else if(currentString.toLowerCase().contains(searchValue.getText().toLowerCase())){
                        setCheck();
                        label.setText(currentString);
                    }else{
                        removeCheck();
                    }
                }

                // второй вариант
                /*if (Arrays.stream(searchableData).anyMatch(s -> s.contains(searchValue.getText()))) {
                    setCheck();
                    label.setText(Arrays.stream(searchableData).filter(s -> s.contains(searchValue.getText())).findFirst().get());
                } else {
                    removeCheck();
                }*/
            }
        });
    }

    private void removeCheck() {
        setIcon("src/cancel.png");
    }

    private void setCheck() {
        setIcon("src/check-mark.png");
    }

    private void setIcon(String path) {
        ImageIcon icon = new ImageIcon(path);
        clickMeButton.setIcon(new ImageIcon(icon.getImage().getScaledInstance(16, 16, Image.SCALE_DEFAULT)));
    }

    public void setData(String[] data) {
        searchableData = data;
    }

    public void setData(List<String> data) {
        searchableData = data.toArray(new String[]{});
    }
}
