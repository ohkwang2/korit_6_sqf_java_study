package come.study.java_study.ch16_제네릭;

public class MessageMain {

    public static void main(String[] args) {

        // 제네릭 와일드 카드 : 기호 -> ?
        // 자료형을 Object로 사용하는 것. Object를 ?로 표기하는 것
        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage(); //Object 자료형을 다운캐스팅 해서 사용하는 것.

        // 와일드 카드 제약 (와일드 카드를 사용할 수 있는 범위를 지정하는 것)
        // 자기 자신이거나 상속받은 변수만 받아와서 사용할 수 있도록 제약을 걸어두는 것 (자신을 기준으로 하행)
        Message<? extends String> m3 = new Message<>("10"); // 하행

        // 자기 자신이거나 상속하는 변수만 받아와서 사용할 수 있도록 제약을 걸어두는 것 (자신을 기준으로 상행)
        Message<? super String> m4 = new Message<>(new Object()); // 상행

        String s2 = m3.getMessage();    // extends에서 자식이 들어오면 다운캐스팅 해줘야 함.
    }

}
