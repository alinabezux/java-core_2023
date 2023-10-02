package lesson1.hw;

public class Dog {
    private String name;
    private int age;
    private String poroda;

    public Dog() {
    }

    public Dog(String name, int age, String poroda) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }
}
