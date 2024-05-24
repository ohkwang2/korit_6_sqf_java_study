package come.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        int count = scanner.nextInt();

        int i = 0;
//        while(i < count) {
//            if(i % 2 == 0) {
//                System.out.println("짝수입니다.");
//                i++;        // continue 이전에 i를 증가시키기 위함
//                continue;   // 다음 반복으로 넘어가라는 의미.
//            }
//            System.out.println("홀수 입니다.");
//            i++;
//        }

        // 위 내용은 for문으로 작성하는 것이 맞음 (반복 횟수가 있기 때문
        // j < count의 조건이 성립 안 되는 경우 (false)이므로 반복이 안 됨 (에러가 아님)
        for(int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수입니다.");
                continue;
            }
            System.out.println("홀수입니다.");
        }
    }

}
