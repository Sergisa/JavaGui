package com.company;

import javax.swing.*;
import java.awt.*;

public class IncreasingLabel extends JLabel {

    public void increaseFontSize(int amount) {
        String oldFontName = getFont().getFontName();
        int oldFontStyle = getFont().getStyle();
        int oldFontSize = getFont().getSize();

        setFont( new Font(oldFontName, oldFontStyle, oldFontSize+amount ) );
    }
}
