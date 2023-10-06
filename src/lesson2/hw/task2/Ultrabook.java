package lesson2.hw.task2;

public class Ultrabook extends Laptop {
    private boolean camera;

    public Ultrabook() {
    }

    public Ultrabook(String OS, int memory, int storage, String color, double display, boolean camera) {
        super(OS, memory, storage, color, display);
        this.camera = camera;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "camera=" + camera +
                "} " + super.toString();
    }
}
