package br.com.rafael.graphical_interfaces.ex06.account;

import java.math.BigDecimal;

public class Account {
    private final String ownerName;
    private final BigDecimal balance, limit;
    private final int number;

    public Account(String ownerName, BigDecimal balance, BigDecimal limit, int number) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.limit = limit;
        this.number = number;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "owner: " + this.ownerName + " balance: $" + this.balance + " limit: $" + this.limit + " number: " + this.number;
    }
}
