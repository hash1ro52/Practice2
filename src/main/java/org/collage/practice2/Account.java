package org.collage.practice2;

public class Account {
    private static int idCounter = 1;
    private final int id;
    private double balance;

    public Account(double initialBalance) {
        this.id = idCounter++;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account{id=" + id + ", balance=" + balance + "}";
    }
}
