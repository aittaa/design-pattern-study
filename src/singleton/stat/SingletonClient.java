
package singleton.stat;


public class SingletonClient {
	public static void main(String[] args) {

		Singleton singleton = Singleton.getInstance();
		System.out.println("singleton = " + singleton);

		Singleton singleton2 = Singleton.getInstance();
		System.out.println("singleton2 = " + singleton2);

		System.out.println("singleton == singleton2 ?  " + (singleton == singleton2));
	}
}
