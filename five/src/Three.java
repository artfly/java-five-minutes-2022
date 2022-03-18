public class Three {

    interface I1 {
        int i = m();

        static int m() {
            return 52;
        }
    }

    class C {
        int i = m();

        static int m() {
            return 52;
        }
    }

    public static void main(String[] args) {
        System.out.println(I1.i);
    }
}
