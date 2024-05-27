package come.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {

        // 개별 변수에 Student 클래스에 해당하는 값을 넣은 후 배열 만들기
        Student student1 = new Student(1, "김", 31);
        Student student2 = new Student(2, "이", 31);
        Student student3 = new Student(3, "박", 31);

        Student[] studentss = new Student[] {
                student1,
                student2,
                student3
        };

        System.out.println(studentss[0].getAge());

        // 3개의 Student를 넣을 수 있는 공간을 만들고, 각각의 공간에 개별 값이 들어간 공간 주소를 채워 넣는 것.
        // 배열 공간을 만들어 놓고, 각 배열 공간에 값 넣기
        Student[] students = new Student[5];
        students[0] = new Student(20240501, "김준일", 31);
        students[1] = new Student(20240502, "김준이", 32);
        students[2] = new Student(20240503, "김준삼", 33);

        for(int i = 0; i < students.length; i++) {
            // 공간은 있는데 데이터가 없는 경우 예외 처리
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());
            System.out.println();
        }
    }
}
