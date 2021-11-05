package singleton.threadsafe;

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}
 
	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			System.out.println("Creating unique instance of singleton.multisingleton.Singleton");
			uniqueInstance = new Singleton();
		}
		System.out.println("Returning instance of singleton.multisingleton.Singleton");
		return uniqueInstance;
	}
 
	// other useful methods here
}
