package lesson2.demos.demo2_enums;

public class Helper {
    public String extractToken(User user) {
        Role role = user.getRole();
        return role.getToken();
    }
}
