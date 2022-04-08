import java.io.IOException;
import java.io.UncheckedIOException;

public class Six {
    public static void main(String[] args) {
        doSmth();
    }

    public static void doSmth() {
//        try {
//            doOther();
//        } catch (Error e) {
//            System.out.println("Error!");
//        }
    }

    public static void doOther() throws IOException {
        throw new UncheckedIOException(new IOException());
    }
}
