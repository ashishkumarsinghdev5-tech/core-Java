package StreamAplExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3  // filter
{
    public static void main(String[] args)
    {
        // List<String>names = Arrays.asList("Ashish", "Kamal","Amal","Sam" ,"Robert","Bach","Ram","Sohan","Ramesh","Ganesh");
       // names.stream().filter(i ->i.startsWith("A")).forEach(i -> System.out.println(i));
        user u1 = new user("Ashish",28);
        user u2 = new user("Kamal",18);
        user u3 = new user("sam",38);
        user u4 = new user("prakash",58);
        Stream<user> stream = Stream.of(u1,u2,u3,u4);
        //which  the age is greater can you filter than logic
       // stream.filter(u -> u.age>=18).forEach(u -> System.out.println(u));
        //which  the age is greater can you filter than name is also filter
        stream.filter(u ->u.age>=18 && u.name.startsWith("K")).forEach(u -> System.out.println(u));


    }
}
class user
{
    String name ;
    int age ;
    user(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString ()
    {
        return "user  [ name =" +name + ", age=" +age + "]";
    }
}
