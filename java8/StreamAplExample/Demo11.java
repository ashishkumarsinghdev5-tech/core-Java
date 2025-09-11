package StreamAplExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// write a program to get Max and Min and avg salary from the given employee data using Stream api

public class Demo11
{
    public static void main(String[] args)
    {

        person2 p1 = new person2(1,"Ashish", "Nepal ",27000.00);
        person2 p2 = new person2(2,"Akmal", "Usa",26500.00);
        person2 p3 = new person2(3,"Some", "India",24800.00);
        person2 p4 = new person2(4,"Sankar", "India",25900.00);
        person2 p5 = new person2(5,"Sand", "India",24699.00);
        person2 p6 = new person2(6,"Slog", "India",34999.00);
        List<person2> list = Arrays.asList(p1,p2,p3,p4,p5,p6);
        Optional<person2> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e ->e.salary)));
        System.out.println("Max Salary :: " + max.get().salary);
        Optional<person2> min = list.stream()
                .collect(Collectors.minBy(Comparator.comparing(e ->e.salary)));
        System.out.println("Min Salary :: " + min.get().salary);
        Double avgSalary  = list.stream().collect(Collectors.averagingDouble(e ->e.salary));
        System.out.println(avgSalary);
    }
}
class person2
{
    int id ;
    String name ;
    String country ;
    double salary ;
    public person2(int id , String name,String country,double salary)
    {
        this.name = name;
        this.salary = salary;
        this.country = country;
        this.id = id ;
    }
}
