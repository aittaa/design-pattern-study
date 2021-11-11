package factory.factorymethod;

import factory.uniquefactory.DaeguBank;
import factory.uniquefactory.GumiBank;

public class BankTestDrive {
    public static void main(String[] args) {

        BankA bankA = new BankA();
        System.out.println(bankA);

        System.out.println(bankA.createAccount("Normal"));
        System.out.println(bankA.createAccount("Minus"));
        System.out.println(bankA.createAccount("Stock"));

        System.out.println();

        BankB bankB = new BankB();
        System.out.println(bankB);
        System.out.println(bankB.createAccount("Normal"));
        System.out.println(bankB.createAccount("Minus"));
        System.out.println(bankB.createAccount("Stock"));


        System.out.println();

        BankC bankC = new BankC();
        System.out.println(bankC);
        System.out.println(bankC.createAccount("Normal"));
        System.out.println(bankC.createAccount("Minus"));
        System.out.println(bankC.createAccount("Stock"));




    }
}
