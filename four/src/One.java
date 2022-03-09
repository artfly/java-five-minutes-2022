public class One {
    static class Nested {
        void foo() {
            System.out.println("Hello!");
        }
    }

    public static void main(String[] args) {
        new Nested().foo();
    }
}
