package strategy.bank;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class MinusWithdraw extends WithdrawBehavior {

    public MinusWithdraw(Account acc) {
        super(acc);
    }

    public boolean withdraw(int amount ) {
        int currentBalance = account.getBalance();

        if( amount <= currentBalance + account.getCreditLimit() ){ // (신용한도액 + 현재잔고)가 출금하려는 금액보다 같거나 큰 경우
            account.setBalance(currentBalance-amount);
            return true;
        }
        return false;
    }

}