// что выведет эта программа?
public class Two {

    private static class Pair {
        String x;
        String y;

        public Pair(String x, String y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        String s1 = "13";
        String s2 = "42";
        Pair pair = new Pair(s1, s2);
        swap(pair);
        System.out.println(pair.x);
        System.out.println(s1);
    }

    private static void swap(Pair pair) {
        String tmp = pair.x;
        pair.x = pair.y;
        pair.y = tmp;
    }

}
