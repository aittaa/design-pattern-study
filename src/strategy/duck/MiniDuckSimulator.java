package strategy.duck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		RubberDuck	rubberDuckie = new RubberDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();

	}
}
