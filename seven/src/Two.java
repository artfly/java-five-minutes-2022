public class Two {

    @FunctionalInterface
    interface Number {
        int n();

        default Number succ() {
            return () -> n() + 1;
        }

        default Number pred() {
            return () -> n() - 1;
        }
    }

    public static void main(String[] args) {
        Number zero = () -> 0;
        System.out.println(zero.succ().succ().succ().pred().n());
    }
}
