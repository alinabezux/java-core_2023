package lesson2.demos.demo2_enums;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Role role = Role.ADMIN;

//        User user = new User("qwrty", Role.ADMIN);
//        Helper helper = new Helper();
//        String extractToken = helper.extractToken(user);
//        System.out.println(extractToken);

        Role[] values = Role.values();
        System.out.println(Arrays.toString(values)); //масив зі значень енамів

        List<Role> roles = Arrays.asList(values);
        System.out.println(roles);//масив зі значень енамів в List

        System.out.println(Role.valueOf("ADMIN"));//значення певного оюєкта енаму

        System.out.println(Role.ADMIN.ordinal());// порядковий номер енаму в масиві



    }
}
