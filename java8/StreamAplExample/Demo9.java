package StreamAplExample;

import java.util.Arrays;
import java.util.List;

public class Demo9
{
    public static void main(String[] args)
    //Matching operation with stream (anyMatch(),allMatch(),noneMatch() concept)
    {
        person p1 = new person("Ashish","Nepal ");
        person p2 = new person("akmal","Usa");
        person p3 = new person("Som","Uk");
        person p4 = new person("Som","India");
        List<person> persons = Arrays.asList(p1,p2,p3,p4);
        boolean Status1 = persons.stream().anyMatch(p -> p.country.equals("India"));
        System.out.println("Any Indian Available ? :: " + Status1  );
        boolean Status2 = persons.stream().anyMatch(p -> p.country.equals("Canada "));
        System.out.println("Any Canadian Available ? :: " + Status2  );
        boolean Status3 = persons.stream().allMatch(p -> p.country.equals("Canada "));
        System.out.println("All Canadian Available ? :: " + Status3  );
        boolean Status4 = persons.stream().noneMatch(p -> p.country.equals("Canada "));
        System.out.println("none Canadian Available ? :: " + Status4  );
    }
}
class person
{
    String name ;
    String country;
    public person(String name ,String country)
    {
        this.name = name ;
        this.country = country;
    }

}
