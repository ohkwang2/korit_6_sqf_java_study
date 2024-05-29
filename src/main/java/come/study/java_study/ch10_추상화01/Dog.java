package come.study.java_study.ch10_추상화01;

// Tiger와 공통되는 특성을 Animal로 묶어서 빼고, Dog의 고유 속성만 Animal에서 확장
public class Dog extends Animal{
//    private String name;
//    private int age;
    private String breed;
//
//    public Dog() {
//    }
//
//    public Dog(String name, int age, String breed) {
//        this.name = name;
//        this.age = age;
//        this.breed = breed;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", breed='" + breed + '\'' +
//                '}';
//    }

    public Dog() {
        // 상속 받은 객체는 생성자에 super()가 생략되어 있음
        super(); // Animal 객체 생성자 호출 (상속 받은 객체 생성자 호출)
        System.out.println("강아지 객체 생성");
//        super(); // 부모 객체로부터 상속 받을 경우 부모 객체를 먼저 생성하지 않고 다른 명령을 실행할 수 없음.
    }

    public Dog(String name, int age, String breed) {
        // Dog가 모든 매개변수를 받아서 Animal에 해당하는 매개 변수를 Animal이 생성될 때 매개변수를 전달
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
