package come.study.java_study.ch14_Object;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data // @Getter @Setter @EqualsAndHashCode @ToString 요거 4개 한 번에 묶어진 기능
public class Teacher {

    private String name;
    private int age;

}
