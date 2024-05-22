package come.study.java_study.ch02_클래스01;

public class StudentMain {

    public static void main(String[] args) {
        Student student1 = new Student(); // 학생1 객체 생성 (메모리 생성)
        Student student2 = new Student(); // 학생2 객체 생성 (메모리 생성)

        student1.name = "손경태";
        student1.age = 29;
        student2.name = "신선애";
        student2.age = 25;
    }
}
