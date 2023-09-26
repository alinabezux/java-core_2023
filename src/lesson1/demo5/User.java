package lesson1.demo5;


import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"id"})
public class User {
    private int id;
    private String name;
    private boolean status;
    private double weight;

    private String greeting(String msg) {
        return msg + "my nane is" + this.name;
    }
}
