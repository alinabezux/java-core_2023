package lesson2.hw.task2;

public class Workstation extends Laptop {
    private boolean trackpoint;

    public Workstation() {
    }

    public Workstation(String OS, int memory, int storage, String color, double display, boolean trackpoint) {
        super(OS, memory, storage, color, display);
        this.trackpoint = trackpoint;
    }

    public boolean isTrackpoint() {
        return trackpoint;
    }

    public void setTrackpoint(boolean trackpoint) {
        this.trackpoint = trackpoint;
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "trackpoint=" + trackpoint +
                "} " + super.toString();
    }
}
