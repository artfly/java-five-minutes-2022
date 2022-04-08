import java.io.IOException;
import java.io.UncheckedIOException;

public class Seven {

    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        try {
            try {
                throw new IOException("IO");
            } catch (IOException e) {
                try {
                    System.out.println("UncheckedIOException");
                    throw new UncheckedIOException(e);
                } catch (RuntimeException e1) {
                    System.out.println("RuntimeException");
                    throw new IllegalStateException("IllegalState");
                }
            } catch (Exception e) {
                System.out.println("Exception");
                throw new RuntimeException("Runtime");
            } finally {
                System.out.println("Finally");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}

