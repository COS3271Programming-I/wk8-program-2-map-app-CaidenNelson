import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapApp {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {

        Map<String,String> login = new HashMap<>();
        Map<String,String> message = new HashMap<>();
        String password;
        String username;

        login.put("Bill","123");
        message.put("Bill","Feed the dogs");

        login.put("Myles","987");
        message.put("Myles","Go for a walk");

        login.put("George","1977");
        message.put("George","Turn off the oven");

        login.put("Micheal","atlu&e42");
        message.put("Micheal","Do your homework");

        login.put("Joe","wjw-ron");
        message.put("Joe","Unplug the toaster");

        System.out.println("what is your username?");
        username = userinput.nextLine();
        username = username.substring(0,1).toUpperCase() + username.substring(1).toLowerCase();

        System.out.println(login.get(username));
        System.out.println("what the pass");
        password = userinput.nextLine();

        if(password.equals(login.get(username))){
            System.out.println(message.get(username));

        }

        else{
            System.out.println("Error incorrect password");
            System.exit(0);

        }
    }
}
