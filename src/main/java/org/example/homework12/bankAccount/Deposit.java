package org.example.homework12.bankAccount;

public class Deposit extends Thread {
    private Account account;
    private long amount;

    public long getDepAmount() {
        return amount;
    }

    public void setDepAmount(long amount) {
        this.amount = amount;
    }

    public Deposit(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 1; i <= amount; i++) {
            account.deposit(1);
        }
    }
}
