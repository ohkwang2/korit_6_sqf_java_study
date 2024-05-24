package come.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Scanner의 nextInt()와 메소드 이름만 같지 다른 기능;
        int num = random.nextInt(10);   // 0 ~ 9까지 숫자 중 랜덤하게 한 개 숫자를 가져옴
//        int num = random.nextInt(10) + 1 ;   // 1 ~ 10까지 숫자 중 랜덤하게 한 개 숫자를 가져옴

        while(true) {
            System.out.println("입력 : ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }

    }

}
