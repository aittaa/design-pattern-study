package strategy.bank;

import java.time.LocalDate;
import java.util.*;

public class SavingAccount extends Account {


    public SavingAccount(LocalDate expiryDate) {
        super();
        setWithdrawBehavior(new SavingWithdraw(this));
        setCalculateInterestBehavior(new SavingCalculate(this));
        setExpiryDate(expiryDate);
    }


}