package lesson1.demos.demo7;


import lombok.*;

@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @NonNull
    public int id;
    @NonNull
    public String name;
    public String skills[] = new String[5];

    public void addSkill(int i, String skill) {
        if (i >= 0 && i < skills.length) {
            skills[i] = skill;
        }
    }
}
