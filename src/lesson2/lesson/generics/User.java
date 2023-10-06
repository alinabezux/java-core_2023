package lesson2.lesson.generics;

import lombok.Data;

@Data
public class User <ID>{
    private ID id;
    private String name;

}
