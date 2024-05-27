package come.study.java_study.ch07_클래스02;

public class StudyB {

    // private은 해당 클래스 주소 내에서는 접근이 가능하지만, 외부에서는 접근이 불가능함.
    private String name;
    private int age;

    // Overloading을 한 번만이라도 하게 되면 default 생성자가 사라지므로, default 기본 생성자를 따로 만들어주어야 함.
    public StudyB() {

    }

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}
