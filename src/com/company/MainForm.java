package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainForm extends JFrame {
    private JPanel root;
    private JList<Student> studentListView;
    private String[] searchableData;

    public MainForm() {
        setVisible(true);
        setContentPane(root);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);


        Student sergey = new Student("sergey", 4, 8);
        Student sofya = new Student("sofya", 5, 1);
        Student john = new Student("john", 5, 3);
        Student anton = new Student("anton", 5, 2);

        List<Student> studentList = new ArrayList<>(Arrays.asList(sergey, sofya, john, anton));
        studentListView.setCellRenderer(new StudentListViewRenderer());
        DefaultListModel<Student> studentListViewModel = new DefaultListModel<>();
        studentListViewModel.addAll(studentList);
        studentListView.setModel(studentListViewModel);

        studentListView.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()){
                    System.out.println(studentListView.getSelectedValue().label);
                }
            }
        });
    }
}
