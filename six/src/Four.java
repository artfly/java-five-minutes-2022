public class Four {

    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
        try {
            try {
                throw new IllegalStateException("IllegalState!");
            } catch (IllegalStateException e) {
                    throw new RuntimeException("Runtime!");
            } catch (RuntimeException e) {
                System.out.println("Nested catch");
                System.out.println(e.getMessage());
            }
        } catch (RuntimeException e) {
            System.out.println("Outer catch");
            System.out.println(e.getMessage());
        }
    }
}
