package lesson2.hw.task1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private Address address;
    private int phone;
    private String website;
    private Company company;

    public User(int id, String name, String username, String email, String street, String suite, String city, int zipcode, Double lat, Double lng, int phone, String website, String companyName, String catchPhrase, String bs) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = new Address(street, suite, city, zipcode, lat, lng);
        this.phone = phone;
        this.website = website;
        this.company = new Company(companyName, catchPhrase, bs);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", phone=" + phone +
                ", website='" + website + '\'' +
                ", company=" + company +
                '}';
    }
}
