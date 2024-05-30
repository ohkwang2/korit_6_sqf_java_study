package come.study.java_study.ch14_Object;

/*
    Object 클래스 (최상위 클래스)
    1. 모든 클래스는 Object 클래스를 상속함 (생략)
    (상속은 하나밖에 못 하지만, 최상위 부모 클래스는 어차피 Object를 상속하고 있음)
    2.

 */


import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("김준일", 31);
        Student student2 = new Student("김준일", 31);

        // Object클래스는 최상위에 있기 때문에 어떤 것이든 Up Casting 가능
        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김준일", 31);

        // toString 생략 가능
        System.out.println(student.toString()); // <- 이거는 주소를 타고가서 toString()의 데이터 값 출력
        String str = new String("데이터");
        System.out.println(str.toString());
        System.out.println(str);
        System.out.println(student);    // <- 이거는 student 객체의 주소값 출력

        String studentData = student.toString();

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        // obj의 hashCode를 override해서 해당 조건이 true가 되도록 만들기
        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash("김준일"));
        System.out.println(Objects.hash("김준일"));
    }
}
