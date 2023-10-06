package lesson2.demos.demo1_composition_agregation;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Passport {
    private String series;
    private String number;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
    }
}
