package come.study.java_study.ch02_클래스01;

public class ObjectMain {

    public static void main(String[] args) {
        int a = 10; //a라는 주소에 10이라는 주소를 넣어준 개념
        //ObjectA라는 Class를 할당한 주소를 objectA에 담음. (litetal과 다르게 값은 비어 있음 0 or null)
        ObjectA objectA1 = new ObjectA(); // ex) 주소 100번
        ObjectA objectA2 = new ObjectA(); // ex) 주소 200번

        System.out.println(a); //주소가 안 나옴 (이유는 주소값이 이미 literal 상수로 지정
        System.out.println(objectA1); //주소가 나옴 (이유는 상수로 지정되어 있지 않기 때문)
        System.out.println(objectA2); //주소가 나옴 (이유는 상수로 지정되어 있지 않기 때문)
        System.out.println(objectA1.name);//주소가 안 나옴 (이유는 name 변수의 주소값이 이미 literal 상수로 지정

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);

   }

}
