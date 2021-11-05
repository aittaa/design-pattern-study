package strategy.bank;

import java.util.*;

/**
 * 
 */
public class NormalCalculate extends CalculateInterestBehavior {

    final int NORMAL_ACC_INTEREST_RATE = 3;// 단위:%

    public NormalCalculate(Account acc) {
        super(acc);
    }

    public int calculate() {
        return account.getBalance() * NORMAL_ACC_INTEREST_RATE / 100;
    }

}