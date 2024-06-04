package come.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
//        Sender sender = new Sender("test1", "test2");
//        Sender sender = new Sender<Integer>(10, 20);
//        System.out.println(sender);

        // Generic을 사용할 때 일반 자료형 사용하지 못함.
        // 무조건 Wrapper 자료형을 사용하거나 클래스 자료형을 사용하여야 함.

        // [ Wrapper 자료형]
        // 일반 자료형 <-> Wrapper 자료형 : 박싱, 언박싱
        // Integer                          int
        // Boolean       --(언박싱)-->       boolean
        // Character     <--(박싱)--         char
        // Double                           double
        // Long                             long
        // Float                            float


        Integer num = new Integer(10);  // 박싱
        int num2 = num.intValue();      // 언박싱

        // Java에서는 자동으로 박싱, 언박싱이 일어남
        Integer num3 = 20;  // 자동 박싱
        int num4 = num3;    // 자동 언박싱

        // 제네릭 : 객체 생성시 메모리 크기, 데이터 형태를 정해주는 기법
        Sender sender1 = new Sender<Integer, String, Double>(10, "String", 3.14);
        Sender sender2 = new Sender<String, String, String>("test1", "test2", "test2");
        Sender<String, String, String> sender3 = new Sender<>("test1", "test2", "test2");
    }

}
