package come.study.java_study.ch16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Message<T> {
    private T message;

}
