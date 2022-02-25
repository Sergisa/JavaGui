package com.company;

import com.formdev.flatlaf.FlatDarculaLaf;

public class Main {

    public static void main(String[] args) {
        FlatDarculaLaf.install();
        String[] array = new String[]{"one", "two", "three"};
        ArrayHandler ah = new ArrayHandler(array);
        ah.append("four");
        ah.append("five");
        ah.sort();
        System.out.println(ah);


        MainForm form = new MainForm();
        form.setData(array);
    }
}
