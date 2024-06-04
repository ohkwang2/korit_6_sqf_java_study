package come.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender <T, T2, T3>{
    // Object 클래스 (최상위 클래스)로 업캐스팅 해서 다른 클래스에서 생성할 수 있게 할 수 있지만,
    // 생성 후 사용할 때는 다운캐스팅 해서 사용해야 함.
//    private Object data1;
//    private Object data2;

//    public Sender(Object data1, Object data2) {
//        this.data1 = data1;
//        this.data2 = data2;
//    }

    // 일반 자료형은 사용 못 함.
    private T data1;
    private T2 data2;
    private T3 data3;


    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }
}
