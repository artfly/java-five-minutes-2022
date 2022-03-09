public class Four {
    class Inner {
        static void foo() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        Inner inner = new Four().new Inner();
        inner.foo();
    }
}
