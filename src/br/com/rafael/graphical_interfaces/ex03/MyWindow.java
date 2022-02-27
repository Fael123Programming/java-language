package br.com.rafael.graphical_interfaces.ex03;

import javax.swing.*;
import java.awt.Color;

public class MyWindow extends JFrame {
    public MyWindow() {
        this.setTitle("GUIs in Java Using swing and awt");
        this.setSize(1000, 500);
        this.setLocation(150, 50);
        if (this.isResizable())
            this.setResizable(false);
        this.getContentPane().setBackground(Color.GREEN);
    }

    public void display() {
        if (!this.isVisible())
            this.setVisible(true);
    }
}
