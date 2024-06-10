package come.study.java_study.ch20_람다;

public class CustomKeyMain {
    public static void main(String[] args) {
        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };
        attackKey.onKeyPress();

        // 인터페이스 내 추상 메소드가 2개인 경우 사용하지 못 함.
        CustomKey skillKey = () -> {
            System.out.println("스킬키 누름");
        };
    }
}
