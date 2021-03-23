package org.example.homework12.bankAccount;

public class Account {
    private volatile long balance = 0;

    public synchronized void withdraw(long amount) {
        if (amount<=0){
            throw new IllegalArgumentException("withdraw amount should be positive");
        }
        while (balance<amount){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance-=amount;
        notifyAll();
    }

    public synchronized void deposit(long amount) {
        if (amount<=0){
            throw new IllegalArgumentException("deposit amount should be positive");
        }
        balance+=amount;
        notifyAll();
    }

    public long getBalance() {
        return balance;
    }
}
