package come.study.java_study.ch08_클래스03;

public class Student {
    private int code;
    private String name;
    private int age;

    // NoArgsConstructor
    public Student() {
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // AllArgsConstructor
    public Student(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    // getter, setter
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
