package come.study.java_study.ch01_변수와_자료형;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String[] chosungs = {"ㄱ", "ㄲ", "ㄴ", "ㄷ", "ㄸ", "ㄹ", "ㅁ", "ㅂ", "ㅃ", "ㅅ", "ㅆ", "ㅇ" , "ㅈ", "ㅉ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};
        String[] jungsungs = {"ㅏ", "ㅐ", "ㅑ", "ㅒ", "ㅓ", "ㅔ", "ㅕ", "ㅖ", "ㅗ", "ㅘ", "ㅙ", "ㅚ", "ㅛ", "ㅜ", "ㅝ", "ㅞ", "ㅟ", "ㅠ", "ㅡ", "ㅢ", "ㅣ"};
        String[] jongsungs = {"", "ㄱ", "ㄲ", "ㄳ", "ㄴ", "ㄵ", "ㄶ", "ㄷ", "ㄹ", "ㄺ", "ㄻ", "ㄼ", "ㄽ", "ㄾ", "ㄿ", "ㅀ", "ㅁ", "ㅂ", "ㅄ", "ㅅ", "ㅆ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ"};

        int uniBase = "민".charAt(0) - 44032;

        char chosung = (char)(uniBase / 28 / 21);
        char jungsung = (char)(uniBase / 28 % 21);
        char jongsung = (char)(uniBase % 28);

        System.out.println((int)chosung + ", " + chosungs[chosung]);
        System.out.println((int)jungsung + ", " + jungsungs[jungsung]);
        System.out.println((int)jongsung + ", " + jongsungs[jongsung]);

    }
}
