package strategy.bank;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class SavingWithdraw extends WithdrawBehavior {

    public SavingWithdraw(Account acc) {
        super(acc);
    }

    public boolean withdraw(int amount) {

        int currentBalance = account.getBalance();

        if( !(account.getExpiryDate().isAfter(LocalDate.now())) && amount <= currentBalance ){ // 계약만료일 이후 && 출금하고자 하는 금액이 잔고보다 같거나 작을 경우
            account.setBalance(currentBalance-amount);
            return true;
        }
        return false;
    }

}