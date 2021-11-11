package factory.uniquefactory;

public class BankTestDrive {
    public static void main(String[] args) {

        DaeguBank daeguBank = new DaeguBank();
        System.out.println(daeguBank);

        System.out.println(daeguBank.createAccount("Normal"));
        System.out.println(daeguBank.createAccount("Minus"));
        System.out.println(daeguBank.createAccount("Stock"));


        GumiBank gumiBank = new GumiBank();
        System.out.println(gumiBank);
        System.out.println(gumiBank.createAccount("Normal"));
        System.out.println(gumiBank.createAccount("Minus"));
        System.out.println(gumiBank.createAccount("Stock"));




    }
}
