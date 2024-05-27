package come.study.java_study.ch08_클래스03;

public class Color {
    private  String code;
    private String name;

    // NoArgsConstructor

    public Color() {
    }

    // AllArgsConstructor

    public Color(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // getter and setter


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("색상코드: " + code);
        System.out.println("색상명: " + name);
    }
}
