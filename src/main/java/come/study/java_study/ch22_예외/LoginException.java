package come.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginException extends RuntimeException{
    private String username;

    // RuntimeException을 상속받을 경우 constructor만들 때, 메세지와 기본 매개변수 두 개를 받을 수 있도록 만들어 주어야 함.
    public LoginException(String message, String username) {
        super(message);
        this.username = username;
    }

    public String getErrorMessage() {
        return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
