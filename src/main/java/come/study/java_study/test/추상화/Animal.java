package come.study.java_study.test.추상화;

public interface Animal {

    void fox();

    default void foxy(){
        System.out.println("안녕 난 여우야");
    }

}
