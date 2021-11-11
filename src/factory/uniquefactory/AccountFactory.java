package factory.uniquefactory;

public class AccountFactory {

    public Account createAccount(String accType){

        if (accType.equals("Normal")){
            return new NormalAccount();
        } else if(accType.equals("Minus")){
            return new MinusAccount();
        } else if(accType.equals("Stock")){
            return new StockAccount();
        } else {
            return null;
        }

    }


}
