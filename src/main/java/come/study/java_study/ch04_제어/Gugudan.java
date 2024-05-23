package come.study.java_study.ch04_제어;

public class Gugudan {

    public static void main(String[] args) {
        /*
        [2단]
        2 X 1 = 2
        2 X 2 = 4
        ...
        2 X 9 = 18

        ...

        [9단]
        9 X 1 = 9
        9 X 2 = 18
        ...
        9 X 9 = 81
         */

        System.out.println("[구구단]");

        for(int i = 0; i < 8; i++) {
            int dan = i + 2;
            System.out.println("[" + dan + "단]");
            for(int j = 0; j<9; j++) {
                int num = j+1;
                System.out.println(dan + " X " + num + " = " + dan*num);
            }
            System.out.println();
        }
    }
}
