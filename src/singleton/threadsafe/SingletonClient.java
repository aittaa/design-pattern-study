package singleton.threadsafe;

public class SingletonClient {
	public static void main(String[] args){

		System.out.println("singleton1 = singleton.multisingleton.Singleton.getInstance()");
		Singleton singleton1 = Singleton.getInstance();
		System.out.println();

		System.out.println("singleton2 = singleton.multisingleton.Singleton.getInstance()");
		Singleton singleton2 = Singleton.getInstance();

		System.out.println();
		System.out.println("singleton1 = " + singleton1);
		System.out.println("singleton2 = " + singleton2);


		System.out.println("singleton1 == singleton2 ? " + (singleton1 == singleton2));
	}
}
