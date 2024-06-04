package come.study.java_study.ch19_익명클래스;

public class CarMain {

    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("K8", "White");
        System.out.println(kiaCar);

        // 익명 클래스 ex) 로그인 버튼 (한 번 생성하여 사용 후 사라지는 클래스)
        // 인터페이스도 동일
        AbstractCar abstractCar = new AbstractCar("MyCar", "Black"){    //extends 기능이 생략
            //익명의 클래스 정의
            @Override
            public void createCar() {
                System.out.println("Just tried to make it");
            }

            @Override
            public void showCar() {
                System.out.println("Car info...");
            }
        };
    }

}
