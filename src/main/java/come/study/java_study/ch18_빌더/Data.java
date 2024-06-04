package come.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
public class Data {

    private String data1;
    private int data2;
    private double data3;
    private String data4;

//    public Data(String data1) {
//        this.data1 = data1;
//    }
//
//    public Data(int data2) {
//        this.data2 = data2;
//    }
//
//    public Data(double data1) {
//        this.data3 = data1;
//    }
//
//    public Data(String data1) {
//        this.data1 = data1;
//    }
    // 동일 타입의 데이터가 2개 있을 경우 어떤 메소드를 선택할지 모름

}
