package come.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    // 유일한 객체 한 개(static으로 컴파일시 미리 할당)만 생성해서
    // 다른 곳에서 인스턴스를 불러오면 기존 생성된 객체를 들고옴
    // 결국, 하나의 객체를 다른 곳에서 공유해서 쉽게 가져와서 사용하기 위함.
    // 이렇게 안 하면 새로운 class에서 객체를 생성할 때 매개변수로 동일한 변수 (주소)를 계속 넣어주어야 함
    private static StudentRepository instance;

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() {
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
