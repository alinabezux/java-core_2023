package lesson2.lesson.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Markup {
    CELL("клітинка"), LINE("лінійка"), NONE("пустий аркуш");

    private String name;

    public String getName() {
        return name;
    }
}
