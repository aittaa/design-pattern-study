package strategy.bank;

import java.time.LocalDate;
import java.util.*;

public class AccountTestDrive {

    public static void main(String[] args) {
        Account minusAcc = new MinusAccount(5000);

        System.out.println("\n==마이너스 통장 테스트 (신용한도:5000)==");

        System.out.println("minusAcc.withdraw(3000)");
        minusAcc.withdraw(3000);

        System.out.println("minusAcc.getBalance() = " + minusAcc.getBalance());

        System.out.println("한도이상 출금 시도");
        System.out.println("minusAcc.withdraw(3000)");
        minusAcc.withdraw(3000);
        System.out.println("minusAcc.getBalance() = " + minusAcc.getBalance());

        System.out.println("minusAcc.calculateInterest() = " + minusAcc.calculateInterest());


        System.out.println("\n\n==노멀 통장 테스트==");

        Account normalAcc = new NormalAccount();
        System.out.println("normalAcc.deposit(5000) //5000원 입금");
        normalAcc.deposit(5000);

        System.out.println("normalAcc.getBalance() = " + normalAcc.getBalance());

        System.out.println("normalAcc.withdraw(500)");
        normalAcc.withdraw(500);

        System.out.println("normalAcc.getBalance() = " + normalAcc.getBalance());

        System.out.println("normalAcc.withdraw(5000)");
        normalAcc.withdraw(5000);

        System.out.println("normalAcc.getBalance() = " + normalAcc.getBalance());
        System.out.println();
        System.out.println("normalAcc.calculateInterest() = " + normalAcc.calculateInterest());

        System.out.println("\n\n==저축 통장 테스트==");


        Account savingAcc1 = new SavingAccount(LocalDate.now().plusMonths(1));
        Account savingAcc2 = new SavingAccount(LocalDate.now());

        System.out.println("'savingAcc1'의 만기일은 한달 뒤");
        System.out.println("'savingAcc2'의 만기일은 오늘");

        System.out.println("savingAcc1.deposit(10000)");
        System.out.println("savingAcc2.deposit(10000)");
        savingAcc1.deposit(10000);
        savingAcc2.deposit(10000);
        System.out.println();

        System.out.println("savingAcc1.withdraw(5000)");
        System.out.println("savingAcc2.withdraw(5000)");
        savingAcc1.withdraw(5000);
        savingAcc2.withdraw(5000);
        System.out.println();

        System.out.println("savingAcc1.getBalance() = " + savingAcc1.getBalance());
        System.out.println("savingAcc2.getBalance() = " + savingAcc2.getBalance());
        System.out.println();
        System.out.println("savingAcc1.calculateInterest() = " + savingAcc1.calculateInterest());


    }
}