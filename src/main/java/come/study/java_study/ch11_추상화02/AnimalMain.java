package come.study.java_study.ch11_추상화02;

public class AnimalMain {

    public static void main(String[] args) {
//        Animal a = new Animal();  // 추상 클래스는 생성 불가

        // 객체 자체를 생성하는 것과 담을 수 있는 공간을 생성하는 것은 다른 개념
        // 생성한 공간 안에 해당 클래스를 생성하면 추상 클래스는 못 들어감.
        Animal[] animals = new Animal[10];

        for(int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0? new Dog() : new Tiger();
        }

        for(Animal animal : animals) {
            animal.move();
        }
    }

}
