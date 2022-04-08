import java.io.IOException;

public class One {

    public static void main(String[] args) {
        doSmth();
    }

    private static void doSmth() {
        try {
            doOther();
        } catch (IOException e) {
            System.out.println("doSmth.catch");
        } finally {
            System.out.println("doSmth.finally");
        }
        System.out.println("doSmth.afterFinally");
    }

    private static void doOther() throws IOException {
        try {
            System.out.println("doOther.try");
        } finally {
            System.out.println("doOther.finally");
            throw new IOException();
        }
    }

}
