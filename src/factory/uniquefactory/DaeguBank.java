package factory.uniquefactory;

public class DaeguBank {
    private AccountFactory factory;

    public DaeguBank(){
        factory = new AccountFactory();
    }

    public Account createAccount(String accType){
        return factory.createAccount(accType);
    }

    @Override
    public String toString() {
        return "DaeguBank 입니다. ";
    }
}
