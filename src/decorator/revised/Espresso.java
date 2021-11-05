package decorator.revised;

public class Espresso extends ConcreteBeverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}

}

