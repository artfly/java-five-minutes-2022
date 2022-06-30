import java.util.Arrays;

public class Twenty {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("one", "two", "three").stream().filter(s -> s.length() > 3).count());
    }
}
