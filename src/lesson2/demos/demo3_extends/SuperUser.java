package lesson2.demos.demo3_extends;

public class SuperUser extends User {
    private String role;

    public SuperUser() {
        //під капотом є super();
    }

    public SuperUser(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void foo() {
    }
}
