package come.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법 (여러사람이 작업할 경우 객체를 1개만 사용해야 할 때 활용)
    2. 생성자가 private으로 외부에서는 생성할 수 없다.

 */

public class StudentMain {
    public static void main(String[] args) {
//        StudentService studentService = new StudentService(); // <- StudentService의 생성자가 private이라서 생성이 안 됨

        StudentService studentService = StudentService.getInstance();
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김준이");
        studentService2.addStudent();

        studentService.getStudentData();

    }
}
