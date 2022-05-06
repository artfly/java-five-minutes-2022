import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class First {
    /*
     Write your own stream class. (5 points in total)
     Supported operations:
     1. map
     2. filter
     3. flatMap
     4. forEach
     5. of(T...)
     Hint: you would need to use classes from package java.util.function
     Hint: there will be some warnings in your code, it's fine
     Please note that you cannot use a regular java.util.Stream inside your class.
    */

    private static class Stream<T> {

        private final Supplier<T[]> supplier;

        public Stream(Supplier<T[]> supplier) {
            this.supplier = supplier;
        }

        public static<V> Stream<V> of(V... elements) {
            return new Stream<>(() -> elements);
        }

        public <V> Stream<V> map(Function<T, V> mapper) {
            Supplier<V[]> vSupplier = () -> {
                T[] elements = supplier.get();
                List<V> result = new ArrayList<>();
                for (T element : elements) {
                    result.add(mapper.apply(element));
                }
                return (V[]) result.toArray();
            };

            return new Stream<>(vSupplier);
        }

        public Stream<T> filter(Predicate<T> predicate) {
            Supplier<T[]> filterSupplier = () -> {
                List<T> result = new ArrayList<>();
                T[] elements = supplier.get();
                for (T element : elements) {
                    if (predicate.test(element)) result.add(element);
                }
                return (T[]) result.toArray();
            };

            return new Stream<>(filterSupplier);
        }

        public <R> Stream<R> flatMap(Function<T, Stream<R>> flatMapper) {
            Supplier<R[]> rSupplier = () -> {
                T[] elements = supplier.get();
                List<R> result = new ArrayList<>();
                for (T element : elements) {
                    Stream<R> elementStream = flatMapper.apply(element);
                    elementStream.forEach(result::add);
                }
                return (R[]) result.toArray();
            };
            return new Stream<>(rSupplier);
        }

        public void forEach(Consumer<T> consumer) {
            T[] elements = supplier.get();
            for (T element : elements) {
                consumer.accept(element);
            }
        }
    }
}
