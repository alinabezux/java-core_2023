package lesson2.hw.task1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    private String street;
    private String suite;
    private String city;
    private int zipcode;
    private Geo geo;


    public Address(String street, String suite, String city, int zipcode, Double lat, Double lng) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = new Geo(lat, lng);
    }
}
