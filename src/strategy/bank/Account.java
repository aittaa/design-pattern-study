package strategy.bank;

import java.time.LocalDate;
import java.util.*;


public class Account {

    private WithdrawBehavior wb;
    private CalculateInterestBehavior cb;
    private int balance = 0;
    private LocalDate expiryDate;
    private int creditLimit;


    public Account() {}

    public boolean withdraw(int amount) {
        return wb.withdraw(amount);
    }
    public int calculateInterest(){
        return cb.calculate();
    }

    public void setWithdrawBehavior(WithdrawBehavior wb) {
        this.wb = wb;
    }

    public void setCalculateInterestBehavior(CalculateInterestBehavior cb) {
        this.cb = cb;
    }



    public int getBalance() {
        return balance;
    }


    protected void setBalance(int newBalance){
        balance = newBalance;
    }

    public void deposit(int amount) {
        if (amount > 0){
            balance += amount;
        }
    }


    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}