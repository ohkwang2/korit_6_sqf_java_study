package come.study.java_study.ch10_추상화01;

public class AnimalMain {

    public static void main(String[] args) {
//        Dog dog = new Dog("콩이", 11, "말티즈");
//        Tiger tiger = new Tiger("옹이", 5, 100);

//        System.out.println(dog);
//        System.out.println(tiger);

        // 생성하는 객체가 다른 객체를 상속 받은 경우 상속 받은 객체가 먼저 생성된 후 상속 받은 객체가 생성
//        Dog dog = new Dog();
//        Tiger tiger = new Tiger();

        // 부모, 자식에 모두 생성자 생성 및 연결
        Dog dog = new Dog("콩이", 11, "말티즈");
//        Tiger tiger = new Tiger("옹이", 5, 100);
        Animal tiger = new Tiger("옹이", 5, 100); //Up Casting

        System.out.println(dog.toString());
        System.out.println(tiger.toString());

        dog.move();
        tiger.move();   //Up casting을 한다고 해서 부모가 가진 명령어를 실행하는 것은 아님
//        tiger.  // tiger 변수는 Animal로 up casting 되어 있는 상태라서 tiger에만 있는 메소드 호출 불가
        ((Tiger) tiger).hunt(); // tiger에만 있는 메소드를 호출하려면 다시 down casting 해야 함. () 주의
        dog.bark(); //dog는 up casting 된 적 없기 때문에 바로 출력 됨

        System.out.println("#################");

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름 없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 11, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println("#################");

        for(Animal animal : animals) {
            // instanceof <- 앞의 인스턴스가 원래 뒤의 자료형인지 확인
            // JAVA 최신버전에서는 instanceof가 없어짐
            if(animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if(animal instanceof  Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }

        for(Animal animal : animals) {
            // instanceof <- 앞의 인스턴스가 원래 뒤의 자료형인지 확인
            // JAVA 최신버전에서는 변수.getClass()와 Class의 class를 비교
            // 걍 이 방식대로 하셈.
            if(animal.getClass() == Tiger.class) {
                System.out.println(animals.getClass());
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if(animal.getClass() == Dog.class) {
                System.out.println(animals.getClass());
                Dog d = (Dog) animal;
                d.bark();
            }
            System.out.println(animals.getClass());
        }

        System.out.println(animals.getClass());
        System.out.println(Dog.class);

    }

}
