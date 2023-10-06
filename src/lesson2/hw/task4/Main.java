package lesson2.hw.task4;

//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'vasya',
//    surname: 'pupkin',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.
public class Main {
    public static void main(String[] args) {

        Car audi = new Car("AUDI", "black", Fuel.GASOLINE);
        User vasya = new User(1, "vasya", "pupkin", "asd@asd.com", 31, Gender.MALE, audi);
        vasya.getSkills().add(new Skill("java"));
        vasya.getSkills().add(new Skill("js"));

        System.out.println(vasya);
    }
}
