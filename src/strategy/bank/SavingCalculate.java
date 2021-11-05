package strategy.bank;

import java.util.*;


public class SavingCalculate extends CalculateInterestBehavior {

    final int SAVING_ACC_INTEREST_RATE = 5;// 단위:%

    public SavingCalculate(Account acc) {
        super(acc);
    }

    public int calculate() {
        return account.getBalance() * SAVING_ACC_INTEREST_RATE / 100;
    }

}