package br.com.rafael.graphical_interfaces.checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ItemListener {
    private final JLabel mainLabel;
    private final JCheckBox checkBox;

    {
        this.mainLabel = new JLabel("God made me happier than ever");
        this.mainLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        this.checkBox = new JCheckBox("Bold");
    }

    public Frame() {
        this.setTitle("Using JCheckBox");
        this.setBounds(550, 380, 400, 70);
        this.getContentPane().setBackground(Color.BLUE);
        this.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
        this.getContentPane().add(this.mainLabel);
        this.getContentPane().add(this.checkBox);
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.checkBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        if (itemEvent.getSource() == this.checkBox) {
            if (this.checkBox.isSelected())
                this.mainLabel.setFont(new Font("Arial", Font.BOLD, 20));
            else
                this.mainLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        }
    }

}
