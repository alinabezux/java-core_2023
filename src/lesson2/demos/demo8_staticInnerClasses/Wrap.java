package lesson2.demos.demo8_staticInnerClasses;

public class Wrap {
    static int x;

    public Wrap(int x) {
        this.x = x;
    }


    static class addOperations {

        public void addOne() {
            x = x + 1;
        }

        public void addTwo() {
            x = x + 2;
        }
    }

    static class removeOperations {
        public void removeOne() {
            x = x - 1;
        }

        public void removeTwo() {
            x = x - 2;
        }
    }


}
