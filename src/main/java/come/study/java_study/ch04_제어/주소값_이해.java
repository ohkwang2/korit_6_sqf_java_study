package come.study.java_study.ch04_제어;

public class 주소값_이해 {

    public static void main(String[] args) {
        String name1 = "김준일";
        String name2 = new String("김준일");
    //    b = "김준일";

        System.out.println(name1);
        System.out.println(name1 == name2);
        System.out.println(name2.equals("김준일"));


        // "김준일" => 999
        String a = "김준일";               // 9999
        String b = new String("김준일");   // 200 -> 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = new String[] {"김준일", new String("김준일")};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);
    }
}
