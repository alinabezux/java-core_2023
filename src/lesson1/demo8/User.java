package lesson1.demo8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;

@Data
public class User {
    @NonNull
    private int id;
    @NonNull
    private String name;

    private ArrayList<String> skills = new ArrayList<String>();
}
