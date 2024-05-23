package come.study.java_study.ch04_제어;

public class Star {

    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
         ****
         ***
         **
         *
         */

        for(int i = 0; i < 5; i++) {
            for(int j=0; j < (5-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
             *
            **
           ***
          ****
         *****
         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (4-i); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < (i+1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         *****
          ****
           ***
            **
             *
         */

        for(int i = 0; i < 5; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (5-i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        /*

            *
           ***
          *****
         *******
        *********

         */

        for(int i = 0; i < 5; i++) {
            for(int k = 0; k < (4-i); k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

         *********
          *******
           *****
            ***
             *

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2*(4-i)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
