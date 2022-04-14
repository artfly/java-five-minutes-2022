import java.util.function.Function;

public class Three {
    private static int getInt(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Function<String, Integer> f = Three::getInt;
        System.out.println(f.apply("42"));
    }
}
