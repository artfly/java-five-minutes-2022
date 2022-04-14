public class Four {

    @FunctionalInterface
    interface I {

        void doSmth(int num);

        default void doOther() {
            System.out.println("other");
        }
    }

    public static void main(String[] args) {
        int num = 42;
        I i = n -> System.out.println(num);
    }
}
