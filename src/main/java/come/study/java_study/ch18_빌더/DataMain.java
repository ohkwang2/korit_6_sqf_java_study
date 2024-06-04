package come.study.java_study.ch18_빌더;

public class DataMain {

    public static void main(String[] args) {
        // AllArgsConstructor만 있을 경우
        Data data = new Data("a", 10, 10.5, "b");

        // NoArgsConstructor와 Setter가 있는 경우
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(213);

        DataEntity dataEntity = DataEntity.builder()
                .data2(10)
                .data1("a")
                .data4("b")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(10)
                .data3(3.14)
                .data4("b")
                .build();
    }
}
