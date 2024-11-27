package org.collage.practice2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String email;
    private List<Account> accounts;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public String toString() {
        return "Client{name='" + name + "', email='" + email + "', accounts=" + accounts + "}";
    }
}
