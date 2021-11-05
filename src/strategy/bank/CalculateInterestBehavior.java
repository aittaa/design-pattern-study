package strategy.bank;

import java.util.*;


public abstract class CalculateInterestBehavior {

    Account account;

    public CalculateInterestBehavior(Account acc){
        this.account = acc;
    }

    public abstract int calculate();

}