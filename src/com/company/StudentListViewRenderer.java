package com.company;

import javax.swing.*;
import java.awt.*;

public class StudentListViewRenderer extends JLabel implements ListCellRenderer<Student> {
    public StudentListViewRenderer() {
        setOpaque(true);
        Font oldFont = getFont();

        setFont(oldFont.deriveFont(Font.PLAIN, 24));
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Student> list, Student currentStudent, int index, boolean isSelected, boolean cellHasFocus) {
        System.out.print(1);
        if(isSelected){
            setBackground(MaterialColors.ORANGE_500);
            setForeground(MaterialColors.BLUE_GRAY_600);
        }else{
            setBackground(MaterialColors.BLACK);
            setForeground(MaterialColors.GREEN_A400);
        }
        setText(currentStudent.label + " возраст: " + currentStudent.age);
        return this;
    }
}
