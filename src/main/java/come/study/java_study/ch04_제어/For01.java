package come.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        // int i = 0; i < 반복횟수; i++ <- 특이 케이스가 아닌 경우 해당 조건을 지킬 것
        // int i = 0 -> i < 10 -> 실행문 -> i++ -> i < 10 -> 실행문 -> i++ -> ...
        for(int i =0; i < 10; i++) {
            System.out.println(i+1);
        }

        System.out.println("***************");

        for(int i=0; i < 10; i++) {
            System.out.println(10-i);
        }
    }
}
