
public class Four {

    private static class Box<T extends Object & Comparable<T>> {
        private final T thing;

        private Box(T thing) {
            this.thing = thing;
        }

        public static<T extends Comparable<T>> Box<T> create(T thing) {
            return new Box<>(thing);
        }

        public T getThing() {
            return thing;
        }
    }

    public static void main(String[] args) {
        System.out.println(Box.create(42).getThing());
    }
}
