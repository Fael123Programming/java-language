package br.com.rafael.graphical_interfaces.layouts.gridlayout;

import javax.swing.*;
import java.awt.*;

//GridLayout organizes the elements like a table where we have lines, cols and cells.
//All cells are resized equally to fit the current area of the frame being displayed.

public class Frame extends JFrame {
    public Frame() {
        this.setLayout(new GridLayout(4, 1, 10, 10));
        this.add(new JLabel("Example of using GridLayout", JLabel.CENTER));
        this.add(new JLabel("We are now what we've planned 1 year go", JLabel.CENTER));
        this.add(new JLabel("A thousand of thoughtless boys were thinking", JLabel.CENTER));
        this.add(new JLabel("they would make a thundering noise", JLabel.CENTER));
        this.setBounds(550, 280, 290, 170);
        this.setTitle("Using GridLayout");
        this.getRootPane().setWindowDecorationStyle(JRootPane.INFORMATION_DIALOG);
        this.setUndecorated(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
