package singleton.multisingleton;

// 최대 5개의 인스턴스를 허용하는 싱글톤 클래스
// 배열의 크기를 제한하여 싱글톤 구현

public class Singleton {

    private static final int MAX_INSTANCES_NUM = 5; // 최대 인스턴스 갯수를 설정 가능
    private static volatile Singleton[] instanceArray = new Singleton[MAX_INSTANCES_NUM];  // 인스턴스들의 레퍼런스가 저장되는 배열이다.

    private Singleton(){}


    // 인스턴스를 반환하는 함수
    public static Singleton getInstance(int instanceIndex){

        // 최대 생성가능 인스턴스 범위를 넘을 경우 예외메시지 출력 후 null 반환
        if (instanceIndex >= MAX_INSTANCES_NUM){
            System.out.printf("인스턴스는 %d개로 제한됩니다. \n이용 가능한 인덱스의 범위는 '%d ~ %d'입니다.\n",
                    MAX_INSTANCES_NUM, 0, MAX_INSTANCES_NUM - 1);
            return null;
        }

        //DCL 방식 활용
        if (instanceArray[instanceIndex] == null){
            synchronized (Singleton.class){

                if(instanceArray[instanceIndex] == null) {
                    System.out.printf("%d번 인덱스 인스턴스 생성완료\n", instanceIndex);
                    instanceArray[instanceIndex] = new Singleton();
                }

            }

        }
        System.out.printf("%d번 인덱스 인스턴스 반환\n", instanceIndex);
        return instanceArray[instanceIndex];
    }

}
