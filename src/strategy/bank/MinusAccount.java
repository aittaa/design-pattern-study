package strategy.bank;

import java.util.*;


public class MinusAccount extends Account {


    public MinusAccount(int creditLimit) {
        super();
        setWithdrawBehavior(new MinusWithdraw(this));
        setCalculateInterestBehavior(new MinusCalculate(this));

        setCreditLimit(creditLimit);
    }



}