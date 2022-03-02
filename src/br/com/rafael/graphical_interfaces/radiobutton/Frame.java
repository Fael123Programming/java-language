package br.com.rafael.graphical_interfaces.radiobutton;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements ItemListener {
    private final JLabel label1, label2;
    private final JTextField tf1, tf2, tf3;
    private final JRadioButton rb1, rb2, rb3;

    {
        this.label1 = new JLabel("Numbers:");
        this.label2 = new JLabel("Result:");
        this.tf1 = new JTextField(5);
        this.tf2 = new JTextField(5);
        this.tf3 = new JTextField(5);
        this.tf3.setEditable(false); //User cannot change its content.
        this.rb1 = new JRadioButton("+");
        this.rb2 = new JRadioButton("-");
        this.rb3 = new JRadioButton("*");
        this.rb1.addItemListener(this);
        this.rb2.addItemListener(this);
        this.rb3.addItemListener(this);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(this.rb1);
        buttonGroup.add(this.rb2);
        buttonGroup.add(this.rb3);
    }

    public Frame() {
        this.setTitle("Using RadioButtons");
        this.setBounds(550, 340, 340, 120);
        this.getContentPane().setLayout(new GridLayout(3, 3));
        this.getContentPane().add(this.label1);
        this.getContentPane().add(this.tf1);
        this.getContentPane().add(this.tf2);
        this.getContentPane().add(this.rb1);
        this.getContentPane().add(this.rb2);
        this.getContentPane().add(this.rb3);
        this.getContentPane().add(this.label2);
        this.getContentPane().add(this.tf3);
        this.getContentPane().add(new JPanel()); //Inserting this element just to fill a blank space.
        this.setUndecorated(true);
        this.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        StringBuilder result = new StringBuilder();
        try {
            float f1 = Float.parseFloat(this.tf1.getText()), f2 = Float.parseFloat(this.tf2.getText());
            Object eventSource =  itemEvent.getSource();
            if (eventSource == this.rb1)
                result.append(f1 + f2);
            else if (eventSource == this.rb2)
                result.append(f1 - f2);
            else
                result.append(f1 * f2);
        } catch(NumberFormatException ignore) {
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Invalid input: it must be of valid numbers", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            this.setVisible(true);
        } finally {
            this.tf3.setText(result.toString());
        }
    }
}
