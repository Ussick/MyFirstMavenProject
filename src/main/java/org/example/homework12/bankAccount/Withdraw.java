package org.example.homework12.bankAccount;

public class Withdraw extends Thread {
    private Account account;
    private long amount;

    public Withdraw(Account account) {
        this.account = account;
    }

    public long getWithAmount() {
        return amount;
    }

    public void setWithAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}
