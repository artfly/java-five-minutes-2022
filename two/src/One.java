// что выведет эта программа?
public class One {
    public static void main(String[] args) {
        String s1 = "13";
        String s2 = "42";
        swap(s1, s2);
        System.out.println(s1);
    }

    private static void swap(String s11, String s22) {
        String tmp = s11;
        s11 = s22;
        s22 = tmp;
    }
}
