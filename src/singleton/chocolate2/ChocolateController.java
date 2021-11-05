package singleton.chocolate2;

//lazy using nested static class

public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();
		boiler.boil();
		boiler.drain();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();

		System.out.println("boiler == boiler2 ? " + (boiler == boiler2));

	}
}
