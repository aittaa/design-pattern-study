package decorator.revised;

public class Decaf extends ConcreteBeverage {
	public Decaf() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

