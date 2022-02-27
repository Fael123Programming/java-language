package br.com.rafael.graphical_interfaces.ex06.frames;

import br.com.rafael.graphical_interfaces.ex06.account.Account;
import br.com.rafael.graphical_interfaces.ex06.exceptions.EmptyAccountRepository;
import br.com.rafael.graphical_interfaces.ex06.numberchecker.NumberChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class ConsultBalanceFrame extends JFrame implements ActionListener {
    private final JButton consultButton, backButton;
    private final JLabel consultLabel;
    private final JTextField accountNumber;
    private final Map<Integer, Account> accounts;
    private final JFrame rootFrame;

    {
        this.consultButton = new JButton("Consult");
        this.backButton = new JButton("Back");
        this.consultLabel = new JLabel("Type Account's number", JLabel.CENTER);
        this.accountNumber = new JTextField();
        this.consultButton.addActionListener(this);
        this.backButton.addActionListener(this);
    }

    public ConsultBalanceFrame(Map<Integer, Account> accounts, JFrame rootFrame) throws EmptyAccountRepository {
        if (accounts.isEmpty())
            throw new EmptyAccountRepository();
        this.accounts = accounts;
        this.setTitle("Consult Balance Of An Account");
        this.setSize(350, 80);
        this.setLocation(450, 300);
        this.getContentPane().setBackground(Color.GRAY);
        this.getContentPane().setLayout(new GridLayout(2, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().add(this.consultLabel);
        this.getContentPane().add(this.accountNumber);
        this.getContentPane().add(this.backButton);
        this.getContentPane().add(this.consultButton);
        this.rootFrame = rootFrame;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.consultButton) {
            this.setVisible(false);
            String accountNumber = this.accountNumber.getText();
            if (NumberChecker.isInvalidNumber(accountNumber))
                JOptionPane.showMessageDialog(null, "Number must be a positive value", "Error", JOptionPane.ERROR_MESSAGE);
            else {
                Account wanted = this.accounts.get(Integer.parseInt(accountNumber));
                if (wanted == null)
                    JOptionPane.showMessageDialog(null, "None account was found with number " + accountNumber, "Warning", JOptionPane.WARNING_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null, "Balance of account " + accountNumber + ": $" + wanted.getBalance(), "Account's Balance", JOptionPane.INFORMATION_MESSAGE);
                this.accountNumber.setText("");
            }
            this.setVisible(true);
        } else if (event.getSource() == this.backButton) {
            this.setVisible(false);
            this.rootFrame.setVisible(true); //To hand control to the main window.
        }
    }
}
