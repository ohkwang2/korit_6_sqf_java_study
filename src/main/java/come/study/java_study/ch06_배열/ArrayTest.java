package come.study.java_study.ch06_배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayTest {

    /*
        방마진 숫자 배열 만들기
        조건
        1. 배열은 5*5로 설정
        2. 시작 위치는 (0, 2)
        3. 방마진에 들어가는 숫자는 1부터 시작
     */
    public static void main(String[] args) {
        int size = 5;
        int[][] magicSquare = new int[size][size];

        int num = 1;
        int row = 0;
        int col = size / 2;
        int curr_row, curr_col;

        while (num <= size * size) {
            magicSquare[row][col] = num++;
            curr_row = row;
            curr_col = col;
            row -= 1;
            col += 1;

            if (row == -1) {
                row = size - 1;
            }
            if (col == size) {
                col = 0;
            }
            if (magicSquare[row][col] != 0) {
                row = curr_row + 1;
                col = curr_col;
                if (row == -1) {
                    row = size - 1;
                }
            }
        }

        printMagicSquare(magicSquare);
    }

    public static void printMagicSquare(int[][] magicSquare) {
        int size = magicSquare.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(magicSquare[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
