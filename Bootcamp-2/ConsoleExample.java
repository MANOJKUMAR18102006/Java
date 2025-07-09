import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String user = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Welcome, " + user);
        } else {
            System.out.println("Console not available.");
        }
    }

}
