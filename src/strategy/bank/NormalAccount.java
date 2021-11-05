package strategy.bank;

import java.util.*;

/**
 * 
 */
public class NormalAccount extends Account {

    public NormalAccount() {
        super();
        setWithdrawBehavior(new NormalWithdraw(this));
        setCalculateInterestBehavior(new NormalCalculate(this));
    }

}