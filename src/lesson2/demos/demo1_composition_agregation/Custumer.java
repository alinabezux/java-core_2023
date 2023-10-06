package lesson2.demos.demo1_composition_agregation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Custumer {
    private String login;
    private String password;
    private Passport passport;

    public Custumer(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
