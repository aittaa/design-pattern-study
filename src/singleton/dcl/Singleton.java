package singleton.dcl;//
// Danger!  This implementation of singleton.multisingleton.Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					System.out.println("Creating unique instance of singleton.multisingleton.Singleton");
					uniqueInstance = new Singleton();
				}
			}
		}
		System.out.println("Returning instance of singleton.multisingleton.Singleton");
		return uniqueInstance;
	}
}
