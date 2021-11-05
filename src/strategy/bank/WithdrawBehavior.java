package strategy.bank;

import java.util.*;

public abstract class WithdrawBehavior {

    Account account;

    public WithdrawBehavior(Account acc) {
        account = acc;
    }

    public abstract boolean withdraw(int amount);

}