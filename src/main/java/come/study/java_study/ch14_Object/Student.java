package come.study.java_study.ch14_Object;

import java.util.Objects;

public class Student extends Object{

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter and setter


    @Override
    // 객체의 값을 비교하기 위해 Ojb의 equals에 Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            // Student가 obj로 업캐스팅 된 것을 Student로 다시 다운캐스팅 (데이터 값 참조 활성화)
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }

    @Override
    // 완전히 다른 객체더라도 안에 있는 값이 같은지 비교하기 위해 hash 사용해서 override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
