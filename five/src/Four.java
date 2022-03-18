public class Four {

    interface I1 {
        static void m() {
            System.out.println("Hallo");
        }
    }

    interface I2 {
        default void m() {
            System.out.println("Hello");
        }
    }

    interface I3 extends I1, I2 {
        default void m() {
            System.out.println("Alloha");
        }
    }

    static class C implements I3 {}

    public static void main(String[] args) {
        I2 c = new C();
        c.m();
    }
}