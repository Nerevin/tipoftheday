package com.nerevin.tipoftheday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Grafon {
    static String a;
    JLabel text = new JLabel("Здесь будет умная надпись", SwingConstants.CENTER);
    public void mainFrame(){
        JFrame frame = new JFrame("Мудрости каждый день");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton tip = new JButton("Получить совет");
        tip.addActionListener(new Tip());
        JButton kama = new JButton("Спросить Каму");
        kama.addActionListener(new Kama());

        frame.getContentPane().add(BorderLayout.SOUTH, tip);
        frame.getContentPane().add(BorderLayout.NORTH, kama);
        frame.getContentPane().add(BorderLayout.CENTER, text);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
    class Tip implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FileRead.tipReader();
            text.setText(a);
        }
    }
    class Kama implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            FileRead.kamaReader();
            text.setText(a);
        }
    }
}
