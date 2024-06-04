package come.study.java_study.charTest;

public class HangulUtils {

    private static final char[] CHO_SUNG =
            {'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
    private static final char[] JUNG_SUNG =
            {'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ', 'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'};
    private static final char[] JONG_SUNG =
            {'\0', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};

    public static boolean isHangul(char ch) {
        return ch >= 0xAC00 && ch <= 0xD7A3;
    }

    public static char getChosung(char ch) {
        if (!isHangul(ch)) return '\0';
        int index = (ch - 0xAC00) / (21 * 28);
        return CHO_SUNG[index];
    }

    public static char getJungsung(char ch) {
        if (!isHangul(ch)) return '\0';
        int index = ((ch - 0xAC00) % (21 * 28)) / 28;
        return JUNG_SUNG[index];
    }

    public static char getJongsung(char ch) {
        if (!isHangul(ch)) return '\0';
        int index = (ch - 0xAC00) % 28;
        return JONG_SUNG[index];
    }
}