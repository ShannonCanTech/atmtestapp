package com.example.atmtestapp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotEmpty
    private String name; //type

    @OneToMany(mappedBy = "theAccount")//accountNumber?
    Set<Transaction> userTransactions; //myMovies from the OneToMany example

    public Account() {
        userTransactions = new HashSet<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Transaction> getUserTransactions() {
        return userTransactions;
    }

    public void setUserTransactions(Set<Transaction> userTransactions) {
        this.userTransactions = userTransactions;
    }
}
