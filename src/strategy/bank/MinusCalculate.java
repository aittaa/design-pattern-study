package strategy.bank;

import java.util.*;

/**
 * 
 */
public class MinusCalculate extends CalculateInterestBehavior {

    final int MINUS_ACC_INTEREST_RATE = -7; // 단위:%

    public MinusCalculate(Account acc) {
        super(acc);
    }

    public int calculate() {

        if(account.getBalance() < 0){   // 잔고가 마이너스인 경우 마이너스 이자
            return -account.getBalance() * MINUS_ACC_INTEREST_RATE / 100;
        }

        return 0;   // 잔고가 마이너스가 아닌 경우 무이자
    }

}