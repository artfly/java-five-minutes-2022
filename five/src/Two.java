public class Two {
    public static void main(String[] args) {
        Int i1 = new Int(1);
        Int i2 = new Int(42);
        System.out.println(i1.compareTo(i2));
    }
}

class Int implements Comparable<Int> {

    private int i;

    Int(int i) {
        this.i = i;
    }

    @Override
    public int compareTo(Int other) {
        return other.i == this.i ? 0 : other.i > this.i ? -1 : 1;
    }
}

interface Comparable<T> {
    int compareTo(T other);
}
