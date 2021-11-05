package singleton.subclass;

public class SingletonTestDrive {
	public static void main(String[] args) {

		System.out.println("foo = CoolerSingleton.getInstance()");
		Singleton foo = CoolerSingleton.getInstance();

		System.out.println("bar = HotterSingleton.getInstance()");
		Singleton bar = HotterSingleton.getInstance();

		System.out.println("foo = " + foo);
		System.out.println("bar = " + bar);

		System.out.println("foo == bar ? = " + (foo == bar));

 	}
}
