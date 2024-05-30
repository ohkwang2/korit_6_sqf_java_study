package come.study.java_study.test;

public class WhileTest {

    // 기존에 설정된 아이디와 비밀번호
    private  String userId = "admin";
    private  String password = "password123";

    public WhileTest() {
    }

    public WhileTest(String password, String userId) {
        this.password = password;
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
