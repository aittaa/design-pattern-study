package decorator.revised;

public class DarkRoast extends ConcreteBeverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

