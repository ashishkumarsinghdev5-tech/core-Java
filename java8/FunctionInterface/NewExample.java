package FunctionInterface;
import java.util.*;

class User
{
    private int id ;
    private String emil;
    public User(int id ,String Email)
    {
        this.id = id ;
        this.emil = Email;

    }
    public int getId()
    {
        return id ;
    }
    public String getEmil()
    {
        return emil ;
    }
}

public class NewExample
{
    public static void main(String[] args)
    {
        List<User>users = Arrays.asList(
                new User(1,"ashish@123"),
                new User(2,"sham@1234"),
                new User(3,"deml@234"),
                new User(4,null) // user without emil
        );
        // search for user with id = 3
        Optional<String>emailOpt= findEmailByUserId(users,4);
        // using optional method
        // convert to lower case if present
        String email = emailOpt.map(String::toLowerCase).orElse("no email found ");
        System.out.println(email);
    }
    static Optional<String>findEmailByUserId(List<User>users,int id)
    {
        return users.stream().filter(u ->u.getId()==id)
                .map(User::getEmil).filter(Objects::nonNull).findFirst();
    }
}
