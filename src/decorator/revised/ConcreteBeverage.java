package decorator.revised;

public abstract class ConcreteBeverage implements Beverage{
    protected String description;

    public String getDescription(){
        return description;
    }

    abstract public double cost();
}
