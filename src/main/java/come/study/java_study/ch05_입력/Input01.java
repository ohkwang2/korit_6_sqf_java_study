package come.study.java_study.ch05_입력;

import java.util.Scanner;

public class Input01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        next() 메소드 특징
        1. 공백과 줄바꿈(엔터)는 무시한다.
        2. 버퍼를 사용한다.
        (한 번에 다량의 데이터를 묶어서 처리하게끔 해 주는 것.)
        (ex) 실시간 영상 스트림시 회색 구간)
        scanner.next()의 buffer는 space로 구분하며, enter는 buffer의 종료를 의미
        (space, enter, esc <- 입력. 모두 buffer가 들어감)

         */

        // scanner.next(); <- String return
        // scanner.nextln(); <- 줄바꿈 일어남
//        String a = scanner.next();

//        System.out.print("a : ");
//        String a = scanner.next();
//        System.out.println("에이 : " + a);
//
//        System.out.print("b : ");
//        String b = scanner.next();
//        System.out.println("비 : " + b);


        System.out.print("a : ");
        String a = scanner.next();
        System.out.println("에이 : " + a);
        //여기서 10입력 후 enter를 치게 되면 a 이후 enter를 가지고 있어 b가 실생되자마자 종료됨


        System.out.print("b : ");
        String b = scanner.nextLine();
        System.out.println("비 : " + b);




        // scanner.nextInt(); <- int return
        // scanner.nextIntln(); <- 줄바꿈 일어남
//        int b = scanner.nextInt();

    }
}
