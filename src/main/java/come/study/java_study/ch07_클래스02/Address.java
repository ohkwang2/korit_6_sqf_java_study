package come.study.java_study.ch07_클래스02;

public class Address {

    public static void main(String[] args) {
        String a1 = "kim";
        String a2 = "kim";
        String a3 = new String("kim");

        System.out.println("변수 a1의 값: " + a1);
        System.out.println("변수 a2의 값: " + a2);
        System.out.println("변수 a3의 값: " + a3);
        System.out.println("변수 a1의 Hash값: " + System.identityHashCode(a1));
        System.out.println("변수 a2의 Hash값: " + System.identityHashCode(a2));
        System.out.println("변수 a3의 Hash값: " + System.identityHashCode(a3));

        System.out.println("==============");
        System.out.println("변수 a1과 a2의 값 비교: " + (a1 == a2));
        System.out.println("변수 a1과 a3의 값 비교: " + (a1 == a3));
        System.out.println("변수 a2과 a3의 값 비교: " + (a2 == a3));
    }

}
