import java.io.IOException;

public class Eight {

        public static void main(String[] args) {
            doSmth();
        }

        private static void doSmth() {
            try (MyClosable closable = new MyClosable(); MyClosable c2 = new MyClosable()) {
                System.out.println("Trying time...");
            } catch (IOException e) {
                System.out.println("Catching time...");
                throw new RuntimeException(e);
            }
        }

        private static class MyClosable implements AutoCloseable {

            public MyClosable() {
                System.out.println("Opening time...");
            }

            @Override
            public void close() throws IOException {
                System.out.println("Closing time...");
            }
        }
}
