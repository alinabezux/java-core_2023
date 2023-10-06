package lesson2.demos.demo7_innerclasses;

public class Wrap {
    private int x;

    public Wrap(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    class addOperations {
        public void addOne() {
            x = x + 1;
        }

        public void addTwo() {
            x = x + 2;
        }
    }

    class removeOperations {
        public void removeOne() {
            x = x - 1;
        }

        public void removeTwo() {
            x = x - 2;
        }
    }


}
