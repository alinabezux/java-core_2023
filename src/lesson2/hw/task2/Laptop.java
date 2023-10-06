package lesson2.hw.task2;

public class Laptop extends PC {
    private String color;
    private double display;


    public Laptop() {
    }

    public Laptop(String OS, int memory, int storage, String color, double display) {
        super(OS, memory, storage);
        this.color = color;
        this.display = display;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "color='" + color + '\'' +
                ", display=" + display +
                "} " + super.toString();
    }
}
