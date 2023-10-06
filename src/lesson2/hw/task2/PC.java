package lesson2.hw.task2;

public class PC {
    private String OS;
    private int memory;
    private int storage;

    public PC() {
    }

    public PC(String OS, int memory, int storage) {
        this.OS = OS;
        this.memory = memory;
        this.storage = storage;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "PC{" +
                "OS='" + OS + '\'' +
                ", memory=" + memory +
                ", storage=" + storage +
                '}';
    }
}
