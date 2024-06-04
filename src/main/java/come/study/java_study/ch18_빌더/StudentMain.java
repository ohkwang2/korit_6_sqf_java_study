package come.study.java_study.ch18_빌더;

public class StudentMain {

    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(1)
                .age(13)
                .name("김박사")
                .build();

        System.out.println(student);
    }
}
