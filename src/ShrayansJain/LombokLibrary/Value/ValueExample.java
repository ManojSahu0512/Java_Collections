package ShrayansJain.LombokLibrary.Value;

/*
* Immutable version of @Data
* All fields are made "private" and "final"
* Setter are not generated
* class itself made final
* Like @Data, toString, Equal and HashCode method generated
* @Getter on all fields
* @RequiredArgsConstructor(since all fields are final,constructor with all fields will get generated, so its equivalent to @AllArgsConstructor)
*
*
* */
//@Value
public class ValueExample {
    String name;
    final Integer age=20;
    //@NonNull String address;
}
