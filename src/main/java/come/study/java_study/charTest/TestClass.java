package come.study.java_study.charTest;

public class TestClass {
    private String a;
    private String b;

    public TestClass(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public String[] getValues() {
        return new String[]{a, b};
    }
}