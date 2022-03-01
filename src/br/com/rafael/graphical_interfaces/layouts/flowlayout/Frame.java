package br.com.rafael.graphical_interfaces.layouts.flowlayout;

import javax.swing.*;
import java.awt.*;

//A layout is a way of organizing the elements of a GUI in a standardized way.
//FlowLayout puts all components one after another until it gets the end of
//the line. Then, it goes to next line (like a text editor).

public class Frame extends JFrame {
    public Frame() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        this.add(new JLabel("Example of using FlowLayout", JLabel.CENTER));
        this.add(new JLabel("We are now what we've planned 1 year go", JLabel.CENTER));
        this.add(new JLabel("A thousand of thoughtless boys were thinking", JLabel.CENTER));
        this.add(new JLabel("they would make a thundering noise", JLabel.CENTER));
        this.setBounds(550, 280, 290, 170);
        this.setTitle("Using FlowLayout");
        this.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
