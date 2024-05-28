package come.study.java_study.ch07_클래스02;

public class Address {

    String res = "";

    public Address(String res) {
        this.res = res;
    }

    public static void main(String[] args) {

        Address ad1 = new Address("kim");
        Address ad2 = new Address("Nam");
        String a1 = "kim";
        String a2 = "Nam";
        String a3 = "kim";
        String a4 = new String("kim");

        System.out.println(ad1);
        System.out.println(System.identityHashCode(ad1));
        System.out.println(a1);
        System.out.println(System.identityHashCode(a1));

        System.out.println("=====================");

        System.out.println(ad2);
        System.out.println(System.identityHashCode(ad2));
        System.out.println(a2);
        System.out.println(System.identityHashCode(a2));

        System.out.println("=====================");

        System.out.println(System.identityHashCode(a3));
        System.out.println(a4);
        System.out.println(System.identityHashCode(a4));

    }

}
