package StreamAplExample;

import java.util.stream.Stream;

public class Demo6  // map method example
    // Task :- Get Employee and age and name , whose salary is >= 50000
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Ashish",28,800000.00);
        Employee e2 = new Employee("Mohan",38,180000.00);
        Employee e3 = new Employee("Ram",18,150000.00);
        Employee e4 = new Employee("Shyam",24,110000.00);
        Employee e5 = new Employee("Gopal",29,180000.00);
        Employee e6 = new Employee("Rani",48,500000.00);
        Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);
       // with map approach hay hind
        /* stream.filter(e -> e.salary >= 5000.00)
                .map(e -> e.name +" - " + e.age)
                .forEach(e -> System.out.println(e));/*

        */
        //
        // without map use direct use
        stream.filter(e ->e.salary >= 50000.00)
                .forEach(e -> System.out.println(e.name +" -"+  e.age));
    }
}
class  Employee
{
    String name ;
    int age ;
    double salary;
    public  Employee ( String name,int age ,double salary)
    {
        this.name = name ;
        this.age = age ;
        this.salary = salary;
    }

}
