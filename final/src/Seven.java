public class Seven {

    private static interface I1 {
        void doSmth();
    }
    private static interface I2 {
        void doSmth();
    }
    private static abstract class Parent {
        void doSmth() {
            System.out.println("Parent.doSmth!");
        }
    }

    private static class Child extends Parent implements I1, I2 {

        @Override
        public void doSmth() {
            System.out.println("doSmth!");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child();
        parent.doSmth();
    }
}
