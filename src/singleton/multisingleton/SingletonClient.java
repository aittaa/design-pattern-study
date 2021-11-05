package singleton.multisingleton;

public class SingletonClient {
    public static void main(String[] args) {

        System.out.println("lazy singleton 이므로 먼저 인스턴스 5개 각각 생성");
        Singleton.getInstance(0);
        Singleton.getInstance(1);
        Singleton.getInstance(2);
        Singleton.getInstance(3);
        Singleton.getInstance(4);

        System.out.println();
        System.out.println();

        System.out.println("한 개의 객체만 가지는지 확인");

        System.out.println();

        Singleton singletonA = Singleton.getInstance(0);
        System.out.println("singletonA = Singleton.getInstance(0)");
        Singleton singletonB = Singleton.getInstance(0);
        System.out.println("singletonB = Singleton.getInstance(0)");
        System.out.println("singletonA == singletonB ? " + (singletonA == singletonB));

        System.out.println();

        singletonA = Singleton.getInstance(1);
        System.out.println("singletonA = Singleton.getInstance(1)");
        singletonB = Singleton.getInstance(1);
        System.out.println("singletonB = Singleton.getInstance(1)");
        System.out.println("singletonA == singletonB ? " + (singletonA == singletonB));

        System.out.println();


        System.out.println("Singleton singleton = Singleton.getInstance(5)");
        Singleton singleton = Singleton.getInstance(5);
        System.out.println("singleton = " + singleton);

    }

}
