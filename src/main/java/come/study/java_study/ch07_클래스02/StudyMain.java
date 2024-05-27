package come.study.java_study.ch07_클래스02;

public class StudyMain {

    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);    // 생성자 호출
        System.out.println(a);
        System.out.println(a.num);
        System.out.println(a.num2);

        StudyB b = new StudyB("김준일", 31);
        b.show();
    }

}
