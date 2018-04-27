package com.example.atmtestapp;

import javax.persistence.*;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double amount;
    private double balance;
    private boolean action;

    @ManyToOne
    private Account theAccount;//accountNumber?

    public Transaction() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAction() {
        return action;
    }

    public void setAction(boolean action) {
        this.action = action;
    }

    public Account getTheAccount() {
        return theAccount;
    }

    public void setTheAccount(Account theAccount) {
        this.theAccount = theAccount;
    }
}
