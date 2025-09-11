package StreamAplExample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// group method  by using Steam api

public class Demo12
{
    public static void main(String[] args)
    {
        person3 p1 = new person3(1,"Ashish", "Nepal ",27000.00);
        person3 p2 = new person3(2,"Akmal", "Usa",26500.00);
        person3 p3 = new person3(3,"Some", "India",24800.00);
        person3 p4 = new person3(4,"Sankar", "India",25900.00);
        person3 p5 = new person3(5,"Sand", "India",24699.00);
        person3 p6 = new person3(6,"Slog", "India",34999.00);
        List<person3> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
        Map<String,List<person3>> data = list.stream()
                .collect(Collectors.groupingBy(e ->e.country));
        System.out.println(data);
    }
}
class person3
{
int id ;
String name ;
String country ;
double salary ;
public person3(int id , String name,String country,double salary)
{
    this.name = name;
    this.salary = salary;
    this.country = country;
    this.id = id ;
}
}

