package lesson3.demos.demo5_commonFunctioalInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Admin {
    private String name;
    private String login;
    private String password;

}
