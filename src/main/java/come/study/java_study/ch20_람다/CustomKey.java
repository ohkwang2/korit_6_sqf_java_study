package come.study.java_study.ch20_람다;

/**
 * When an object implementing interface <code>CustomKey</code> is used
 * to create a thread, starting the thread causes the object's
 * <code>onKeyPress</code> method to be called in that separately executing
 * thread.
 * <p>
 * The general contract of the method <code>onKeyPress</code> is that it may
 * take any action for pressing any keys.
 *
 * @제작자     권오광
 */

@FunctionalInterface
public interface CustomKey {
    void onKeyPress();
}