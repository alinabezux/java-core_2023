package lesson2.lesson.singletone;

public class Service {
    public static final Service service = new Service();

    private Service() {
    }

    public void print(){
        System.out.println("singleton..");
    }
}
