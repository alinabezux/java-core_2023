package lesson2.demos.demo2_enums;

public enum Role {
    ADMIN("qwerty"), MANAGER("hello"), SUPERVISOR;

    private String token;

    Role() {
    }
    Role(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
