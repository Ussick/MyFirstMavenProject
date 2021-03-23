package org.example.homework12.bankAccount;

public class AccountApp {
    public static void main(String[] args) {
        Account account = new Account();
        Deposit deposit = new Deposit(account);
        Withdraw withdraw = new Withdraw(account);
        deposit.setDepAmount(10_000_000);
        withdraw.setWithAmount(9_999_999);
        withdraw.start();
        deposit.start();
        try {
            deposit.join();
            withdraw.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("balance= " + account.getBalance());
    }
}
