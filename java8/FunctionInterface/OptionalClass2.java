package FunctionInterface;

import java.util.Optional;
import java.util.Scanner;


public class OptionalClass2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  User id ");
        int userId = sc.nextInt();

        OptionClassDemo u = new OptionClassDemo();
       /* String userName = u.getUsernameById(userId);
        if (userName != null) {
            String msg = userName.toUpperCase() + ", Hello";
            System.out.println(msg);
        }*/
        Optional<String> username =u.getUsername(userId);
        if (username.isPresent())
        {
            String name = username.get();
            System.out.println(name.toUpperCase()+", hello");
        }
        else
        {
            System.out.println("no data found" );
        }
    }
}


