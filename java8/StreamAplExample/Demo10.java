package StreamAplExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo10
    // collector  names of person who are belongs to india and store into   name collection
{
    public static void main(String[] args) {


        person1 p1 = new person1("Ashish", "Nepal ");
        person1 p2 = new person1("akmal", "Usa");
        person1 p3 = new person1("Som", "India");
        person1 p4 = new person1("Som", "India");
        person1 p5 = new person1("Som", "India");
        person1 p6 = new person1("Som", "India");
        List<person1> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);
        List<String> nameList = persons.stream().filter(p -> p.country.equals("India"))
                .map(p -> p.name)
                .collect(Collectors.toList());
        System.out.println(nameList);
    }
}

class person1
{
    String name ;
    String country;
    public person1(String name ,String country)
    {
        this.name = name ;
        this.country = country;
    }
    @Override
    public String toString ()
    {
        return "person [name = " + name + ",country =" +country+ "]";
    }

}
