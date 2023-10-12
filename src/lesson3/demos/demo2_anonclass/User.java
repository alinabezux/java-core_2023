package lesson3.demos.demo2_anonclass;

public class User implements Singer {
    private String msg;
    @Override
    public void sing() {
        System.out.println("lololo" + msg + this.greeting());
    }

    public String greeting(){
        return " hello";
    }
}
