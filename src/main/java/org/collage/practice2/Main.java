package org.collage.practice2;

public class Main {
    public static void main(String[] args) {
        BankSystem bank = BankSystem.getInstance("Digital Bank");

        bank.setPolicy("Your trusted digital banking partner.");
        System.out.println("Bank Name: " + bank.getName());
        System.out.println("Policy: " + bank.getPolicy());

        Client client1 = new Client("Alice Johnson", "alice@mail.com");
        Client client2 = new Client("Bob Smith", "bob@mail.com");

        bank.addClient(client1);
        bank.addClient(client2);

        Account account1 = new Account(1000.50);
        Account account2 = new Account(500.00);

        client1.addAccount(account1);
        client2.addAccount(account2);

        bank.processTransaction(account1, account2, 200);

        System.out.println(client1.getName() + "'s Accounts: " + client1.getAccounts());
        System.out.println(client2.getName() + "'s Accounts: " + client2.getAccounts());

        // Удаляем клиента
        bank.removeClient(client1);
        System.out.println("Clients after removal: " + bank.getClients());
    }
}
