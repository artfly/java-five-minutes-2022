public class Eight {

    enum Command {
        LIST,
        REGISTER,
        MESSAGE,
        DISCONNECT
    }

    public static void main(String[] args) {
        System.out.println(getCommand(2));
    }

    private static Command getCommand(int n) {
        return Command.values()[n];
    }
}
