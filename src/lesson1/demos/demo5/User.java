package lesson1.demos.demo5;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private boolean status;
    private double weight;

    private String greeting(String msg) {
        return msg + "my nane is" + this.name;
    }
}
