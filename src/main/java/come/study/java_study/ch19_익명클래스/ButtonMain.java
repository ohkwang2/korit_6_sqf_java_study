package come.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        HomeButton homeButton = new HomeButton();
        click(homeButton);

        click(new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        }); // class 가져와보면 뒤에 $ 숫자 붙어있음.

    }

    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();
    }
}
