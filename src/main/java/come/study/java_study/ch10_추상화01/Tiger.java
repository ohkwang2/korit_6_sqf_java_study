package come.study.java_study.ch10_추상화01;

// Dog와 공통되는 특성을 Animal로 묶어서 빼고, Tiger의 고유 속성만 Animal에서 확장
public class Tiger extends Animal{
//    private String name;
//    private int age;
    private int power;

//    public Tiger() {
//
//    }
//
//    public Tiger(String name, int age, int power) {
//        this.name = name;
//        this.age = age;
//        this.power = power;
//    }
//
//    @Override
//    public String toString() {
//        return "Tiger{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", power=" + power +
//                '}';
//    }

    public Tiger() {
        // 상속 받은 객체는 생성자에 super()가 생략되어 있음
        super(); // Animal 객체 생성자 호출 (상속 받은 객체 생성자 호출)
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        // Tiger가 모든 매개변수를 받아서 Animal에 해당하는 매개 변수를 Animal이 생성될 때 매개변수를 전달
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계에서만 가능
    // 상속받은 메소드를 자식이 재정의 하는 것
    @Override   // @ 어노테이션 (특별한 기능은 없는데, 부모의 메소드를 재정의 했다는 것을 표시하기 위함)
    public void move() {
        System.out.println("호랑이가 네발로 뛰어 갑니다.");
        super.move();   //부모가 가진 것도 같이 사용하고 싶을 경우 super을 사용
    }

    // overloading
    public void move(int a) {
        System.out.println("overloading");
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
