package come.study.java_study.ch12_추상화03;

public abstract class AbstractAuthority implements Authority {
    private String role;

    public AbstractAuthority() {
        role = DEFAULT_DOLRE;

    }

    // ??? 왜 생성자가 만들어지지??
    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
