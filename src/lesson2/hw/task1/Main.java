package lesson2.hw.task1;

//створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//        https://jsonplaceholder.typicode.com/users/1
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", "Kulas Light", "Apt. 556", "Gwenborough", 548491281, -37.3159, 81.1496, 84851984, "hildegard.org", "Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
        System.out.println(user);

        Address address = user.getAddress();
        System.out.println(address);
    }
}
