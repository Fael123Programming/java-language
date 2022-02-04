package br.com.rafael.graphical_interfaces.ex02;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        JLabel label1 = new JLabel("This is a label", new ImageIcon("/home/leafar/Pictures/git_logo.png"), JLabel.CENTER);
        this.setTitle("My frame made in Java");
        this.setSize(900, 500);
        this.setLocation(300, 150);
        this.getContentPane().setBackground(new Color(220, 220, 0));
        this.getContentPane().setLayout(new GridLayout(2, 1));
        this.getContentPane().add(label1);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display() {
        if (this.isVisible())
            return;
        this.setVisible(true);
    }
}
