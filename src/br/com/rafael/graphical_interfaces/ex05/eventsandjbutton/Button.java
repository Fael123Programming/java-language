package br.com.rafael.graphical_interfaces.ex05.eventsandjbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Button extends JButton {
    public Button(ActionListener listener) {
        this.setSize(10, 10);
        this.setHorizontalTextPosition(AbstractButton.CENTER);
        this.setBackground(Color.DARK_GRAY);
        this.setFont(new Font("Scripts", Font.BOLD, 20));
        this.setEnabled(true);
        this.setToolTipText("Click here to see the current time");
        this.setMnemonic(KeyEvent.VK_B); //ALT + B
        this.addActionListener(listener); //listener will handle the action for when this button become clicked.
    }
}
