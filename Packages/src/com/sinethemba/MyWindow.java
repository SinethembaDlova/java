package com.sinethemba;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(620,130);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerfLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font(Font.SANS_SERIF, Font.BOLD, 12);
        g.setFont(sansSerfLarge);
        g.drawString("I am enjoying the Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("By Sinethemba Dlova", 60, 100);

    }
}
