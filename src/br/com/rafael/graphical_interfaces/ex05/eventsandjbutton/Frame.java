package br.com.rafael.graphical_interfaces.ex05.eventsandjbutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.time.LocalTime;

public class Frame extends JFrame implements ActionListener {
    private final JButton button;

    public Frame() {
        this.button = new Button(this);
        this.setTitle("Current Time");
        this.setSize(350, 350);
        this.setLocation(300, 300);
        this.setResizable(false);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(180, 180, 180));
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(this.button);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button)
            JOptionPane.showMessageDialog(null, "Time is " + LocalTime.now(), "Current TIme", JOptionPane.INFORMATION_MESSAGE);
    }
}
