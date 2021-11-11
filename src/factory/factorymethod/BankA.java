package factory.factorymethod;

public class BankA implements Bank {


    public Account createAccount(String accType){
        if (accType.equals("Normal")){
            return new NormalAccountA();
        } else if(accType.equals("Minus")){
            return new MinusAccountA();
        } else if(accType.equals("Stock")){
            return new StockAccountA();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "BankA 입니다. ";
    }


}
