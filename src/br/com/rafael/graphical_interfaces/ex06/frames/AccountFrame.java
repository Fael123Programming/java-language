package br.com.rafael.graphical_interfaces.ex06.frames;

import br.com.rafael.graphical_interfaces.ex06.account.Account;
import br.com.rafael.graphical_interfaces.ex06.exceptions.EmptyAccountRepository;
import br.com.rafael.graphical_interfaces.ex06.numberchecker.NumberChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.TreeMap;

public class AccountFrame extends JFrame implements ActionListener {
    private final JButton createAccountButton, seeAccountsCreatedButton, consultBalanceButton, exitButton;
    private final JLabel ownerNameLabel, balanceLabel, limitLabel;
    private final JTextField ownerName, balance, limit;
    private final TreeMap<Integer, Account> accounts;
    private int accountCounter;

    {
        this.ownerNameLabel = new JLabel("Owner Name", JLabel.CENTER);
        this.balanceLabel = new JLabel("Balance $", JLabel.CENTER);
        this.limitLabel = new JLabel("Limit $", JLabel.CENTER);
        this.ownerName = new JTextField();
        this.balance = new JTextField();
        this.limit = new JTextField();
        this.createAccountButton = new JButton("Create Account");
        this.seeAccountsCreatedButton = new JButton("See Accounts Created");
        this.consultBalanceButton = new JButton("Consult Balance");
        this.exitButton = new JButton("Exit");
        this.createAccountButton.addActionListener(this);
        this.seeAccountsCreatedButton.addActionListener(this);
        this.consultBalanceButton.addActionListener(this);
        this.exitButton.addActionListener(this);
        this.accounts = new TreeMap<>();
    }

    public AccountFrame() {
        this.setTitle("Create Account");
        this.setSize(350, 150);
        this.setLocation(450, 300);
        this.getContentPane().setBackground(Color.GRAY);
        this.getContentPane().setLayout(new GridLayout(5, 2));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.getContentPane().add(this.ownerNameLabel);
        this.getContentPane().add(this.ownerName);
        this.getContentPane().add(this.balanceLabel);
        this.getContentPane().add(this.balance);
        this.getContentPane().add(this.limitLabel);
        this.getContentPane().add(this.limit);
        this.getContentPane().add(this.seeAccountsCreatedButton);
        this.getContentPane().add(this.createAccountButton);
        this.getContentPane().add(this.exitButton);
        this.getContentPane().add(this.consultBalanceButton);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == this.seeAccountsCreatedButton) {
            this.setVisible(false);
            if (this.accounts.isEmpty())
                JOptionPane.showMessageDialog(null, "None accounts were created so far", "Warning", JOptionPane.WARNING_MESSAGE);
            else {
                StringBuilder strBuilder = new StringBuilder();
                this.accounts.forEach((k, v) -> strBuilder.append(v).append("\n"));
                JOptionPane.showMessageDialog(null, strBuilder, "Accounts Already Created", JOptionPane.INFORMATION_MESSAGE);
            }
            this.setVisible(true);
        } else if (event.getSource() == this.createAccountButton) {
            this.setVisible(false);
            String ownerName = this.ownerName.getText(), balance = this.balance.getText(), limit = this.limit.getText();
            if (ownerName.isBlank())
                JOptionPane.showMessageDialog(null, "Owner name cannot be blank", "Error", JOptionPane.ERROR_MESSAGE);
            else if (NumberChecker.isInvalidNumber(balance))
                JOptionPane.showMessageDialog(null, "Balance must be a valid positive number", "Error", JOptionPane.ERROR_MESSAGE);
            else if (NumberChecker.isInvalidNumber(limit))
                JOptionPane.showMessageDialog(null, "Limit must be a valid positive number", "Error", JOptionPane.ERROR_MESSAGE);
            else {
                this.accounts.put(++this.accountCounter, new Account(ownerName, new BigDecimal(balance), new BigDecimal(limit), this.accountCounter));
                JOptionPane.showMessageDialog(null, "Account created\nOwner: " + ownerName + " \t Balance: $" + balance);
                this.ownerName.setText("");
                this.balance.setText("");
                this.limit.setText("");
            }
            this.setVisible(true);
        } else if (event.getSource() == this.consultBalanceButton) {
            this.setVisible(false);
            try {
                ConsultBalanceFrame consultBalanceFrame = new ConsultBalanceFrame(this.accounts, this);
                consultBalanceFrame.setVisible(true); //If everything went cool we'll get here.
            } catch (EmptyAccountRepository ignore) {
                JOptionPane.showMessageDialog(null, "None accounts were created so far", "Warning", JOptionPane.WARNING_MESSAGE);
                this.setVisible(true);
            }
        } else if (event.getSource() == this.exitButton) {
            System.exit(0);
        }
    }
}
