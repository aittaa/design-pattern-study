package factory.factorymethod;



public class BankB implements Bank{


    public Account createAccount(String accType){
        if (accType.equals("Normal")){
            return new NormalAccountB();
        } else if(accType.equals("Minus")){
            return new MinusAccountB();
        } else if(accType.equals("Stock")){
            return new StockAccountB();
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "BankB 입니다. ";
    }

}
