public class Four {
    public static void main(String[] args) {
        m(42);
    }

    private static void m(int i) {
        m1(i);
    }

    private static void m1(Integer m1) {
        System.out.println(m1.doubleValue());
    }
}
