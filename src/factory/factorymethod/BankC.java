package factory.factorymethod;


public class BankC implements Bank{

    public Account createAccount(String accType){
        if (accType.equals("Normal")){
            return new NormalAccountC();
        } else if(accType.equals("Minus")){
            return new MinusAccountC();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "BankC 입니다. ";
    }

}
