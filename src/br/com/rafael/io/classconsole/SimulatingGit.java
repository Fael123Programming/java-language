import java.io.Console;
import java.util.Arrays;

public class SimulatingGit {
    public static void main(String[] args) {
        Console console = System.console();
        StringBuilder builder = new StringBuilder(console.readLine("Username for 'https://github.com': "));
        char[] password = console.readPassword("Password: ");
        if (Arrays.toString(password).equals("[1, 2, 3, 4, 5]"))
            console.printf("All code was pushed towards " + builder);
        else
            console.printf("Invalid credentials");
        console.printf("\n");
    }
}
