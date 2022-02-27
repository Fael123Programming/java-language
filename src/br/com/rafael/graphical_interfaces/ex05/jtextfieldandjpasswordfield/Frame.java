package br.com.rafael.graphical_interfaces.ex05.jtextfieldandjpasswordfield;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {
    private final JButton showPasswordButton, loginButton;
    private final JTextField textField;
    private final JPasswordField passwordField;

    public Frame() {
        JLabel label1 = new JLabel("Username", JLabel.CENTER), label2 = new JLabel("Password", JLabel.CENTER);
        this.textField = new JTextField();
        this.passwordField = new JPasswordField();
        passwordField.setEchoChar('*');
        JPanel panel = new JPanel();
        this.showPasswordButton = new JButton("Show password");
        this.loginButton = new JButton("Log in");
        this.setTitle("Enter your credentials");
        this.setSize(350, 100);
        this.setLocation(450, 300);
        this.getContentPane().setBackground(Color.GRAY);
        this.getContentPane().setLayout(new GridLayout(3, 2));
        this.getContentPane().add(label1);
        this.getContentPane().add(this.textField);
        this.getContentPane().add(label2);
        this.getContentPane().add(this.passwordField);
//        this.getContentPane().add(panel);
        this.getContentPane().add(this.showPasswordButton);
        this.getContentPane().add(this.loginButton);
        this.showPasswordButton.addActionListener(this);
        this.loginButton.addActionListener(this);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.showPasswordButton) {
            String password = new String(this.passwordField.getPassword());
            if (password.isBlank())
                JOptionPane.showMessageDialog(null, "Password is blank", "Warning", JOptionPane.ERROR_MESSAGE);
            else
                JOptionPane.showMessageDialog(null, "Password: " + password, "Password", JOptionPane.INFORMATION_MESSAGE);
        } else if (event.getSource() == this.loginButton) {
            String username = this.textField.getText(), password = new String(this.passwordField.getPassword());
            if (username.equals("rafael_guimaraes") && password.equals("123456789")) {
                System.out.println("Got into the system");
                System.exit(0);
            } else
                JOptionPane.showMessageDialog(null, "Invalid credentials", "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }
}
