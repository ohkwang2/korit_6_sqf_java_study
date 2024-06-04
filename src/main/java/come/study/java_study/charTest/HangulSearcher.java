package come.study.java_study.charTest;

public class HangulSearcher {

    public boolean searchByChosung(TestClass testClass, char chosung) {
        for (String value : testClass.getValues()) {
            for (char ch : value.toCharArray()) {
                if (HangulUtils.isHangul(ch) && HangulUtils.getChosung(ch) == chosung) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchByJungsung(TestClass testClass, char jungsung) {
        for (String value : testClass.getValues()) {
            for (char ch : value.toCharArray()) {
                if (HangulUtils.isHangul(ch) && HangulUtils.getJungsung(ch) == jungsung) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchByJongsung(TestClass testClass, char jongsung) {
        for (String value : testClass.getValues()) {
            for (char ch : value.toCharArray()) {
                if (HangulUtils.isHangul(ch) && HangulUtils.getJongsung(ch) == jongsung) {
                    return true;
                }
            }
        }
        return false;
    }
}
