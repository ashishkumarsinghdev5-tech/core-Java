package StreamAplExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo8
    // flatmap example (Slicing Operation)
{
    public static void main(String[] args)
    {
        List<String> javacourses = Arrays.asList("core java","adv java ","Spring Boot","Micro Service");
        javacourses.stream().limit(3).forEach(c -> System.out.println(c));
        javacourses.stream().skip(3).forEach(c -> System.out.println(c));
        List<String> names = Arrays.asList("raja","kamal","rani","kali","raja","Anmol");
        names.stream().distinct().forEach(name -> System.out.println(name));
    }
}
