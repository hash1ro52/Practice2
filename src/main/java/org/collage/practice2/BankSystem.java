package org.collage.practice2;

import java.util.HashMap;

public class BankSystem {
    private HashMap<String, Client> clients;
    private String name;
    private String policy;

    private static BankSystem instance;

    private BankSystem(String name) {
        this.name = name;
        this.clients = new HashMap<>();
        this.policy = "";
    }

    public static BankSystem getInstance(String name) {
        if (instance == null) {
            instance = new BankSystem(name);
        }
        return instance;
    }

    public boolean addClient(Client client) {
        if (!clients.containsKey(client.getEmail())) {
            clients.put(client.getEmail(), client);
            return true;
        }
        return false;
    }

    public boolean removeClient(Client client) {
        return clients.remove(client.getEmail()) != null;
    }

    public Client getClient(String email) {
        return clients.get(email);
    }

    public HashMap<String, Client> getClients() {
        return new HashMap<>(clients);
    }

    public String getName() {
        return name;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public void processTransaction(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.withdraw(amount)) {
            toAccount.deposit(amount);
            System.out.println("Transaction successful: " + amount + " transferred.");
        } else {
            System.out.println("Transaction failed: Insufficient funds.");
        }
    }
}
