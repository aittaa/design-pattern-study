package strategy.bank;

import java.time.LocalDate;
import java.util.*;

/**
 * 
 */
public class NormalWithdraw extends WithdrawBehavior {


    public NormalWithdraw(Account acc) {
        super(acc);
    }

    public boolean withdraw(int amount ) {
        int currentBalance = account.getBalance();

        if( amount <= currentBalance ){ // 출금하고자 하는 금액이 잔고보다 같거나 작을 경우
            account.setBalance(currentBalance-amount);
            return true;
        }
        return false;
    }

}