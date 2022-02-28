import java.io.Console;

public class RunnableTest {
    public static void main(String[] args) {
		Console console = System.console();		
	    char[] password = console.readPassword("%s", "Password: ");
//      Echoing of characters is disabled when reading a password from terminal.
//      Why does it use a char array instead of a conventional String ?
//      Because strings maintain their content on memory in the pool of strings.
//      A hacker would adore to get access to it.
        char[] checkedPassword = {'1', '2', '3', '4', '5'};
        StringBuilder builder = new StringBuilder("Access ");
        if (validPassword(password, checkedPassword))
            builder.append("allowed");
        else
            builder.append("denied");
        console.format("%s\n", builder);
        if (builder.toString().equals("Access allowed"))
            console.printf("That is the safest password you could ever have made!");
        console.printf("\n");
    }

    private static boolean validPassword(char[] typedPassword, char[] realPassword) {
        if (typedPassword.length != realPassword.length)
            return false;
        for (int i = 0; i < typedPassword.length; i++)
            if (typedPassword[i] != realPassword[i])
                return false;
        return true;
    }
}