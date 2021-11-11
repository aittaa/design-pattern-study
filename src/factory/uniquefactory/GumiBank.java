package factory.uniquefactory;

public class GumiBank {
    private AccountFactory factory;

    public GumiBank(){
        factory = new AccountFactory();
    }

    public Account createAccount(String accType){
        return factory.createAccount(accType);
    }

    @Override
    public String toString() {
        return "GumiBank 입니다. ";
    }

}
