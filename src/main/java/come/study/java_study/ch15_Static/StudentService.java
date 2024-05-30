package come.study.java_study.ch15_Static;

public class StudentService {
    private static StudentService instance;

    // 생성자가 private이라서 다른 클래스에서 해당 객체가 생성이 안 됨
    private StudentService() {}

    // 생성이 되지 않고도 해당 클래스 내 static으로 생성된 객체를 새로 생성
    // static 영역이 아닌걸 static영역으로 가져와서 static 영역에서 처리를 할 수 없음
    // 최초 생성 이후에는 if문이 false이기 때문에 기존에 만든 영역을 공유
    public static StudentService getInstance() {
        if (instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김준일");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name: names) {
            System.out.println(name);
        }
        System.out.println();
    }

}

