package StreamAplExample;

import java.util.*;
import java.util.stream.Collectors;

public class Demo15
{
    public static void main(String[] args)
    {
        List<Employee1>emps = new ArrayList<Employee1>();
        emps.add(new Employee1(1,"Jhansi",32,"Female","HR",2011,25000.00));
        emps.add(new Employee1(2,"Smith",30,"Female","SALES",2018,35000.00));
        emps.add(new Employee1(3,"David",39,"male","INFRA",2010,55000.00));
        emps.add(new Employee1(4,"Orlan",22,"male","DEVELOP",2016,85000.00));
        emps.add(new Employee1(5,"Charles",42,"male","HR",2019,25800.00));
        emps.add(new Employee1(6,"Cathy",52,"male","SECURITY",2009,45000.00));
        emps.add(new Employee1(7,"Ramesh",32,"male","ADMIN",2008,105000.00));
        emps.add(new Employee1(8,"Suresh",34,"male","FINANCE",2011,65000.00));
        emps.add(new Employee1(9,"Gita",30,"Female","HR",2011,35000.00));
        emps.add(new Employee1(10,"Mahesh",28,"male","SALES",2011,65000.00));
        emps.add(new Employee1(11,"Gou",26,"Female","INFRA",2019,75000.00));
        emps.add(new Employee1(12,"Net",42,"Female","DEVELOP",2012,95000.00));
        emps.add(new Employee1(13,"Swathe",26,"Female","SALES",2014,45000.00));
        emps.add(new Employee1(14,"Butler",30,"male","ADMIN",2017,105000.00));
        emps.add(new Employee1(15,"Ashok",31,"male","INFRA",2010,65000.00));
        // concept 1 :  how many male and female
       /* Map<String,Long> map1 = emps.stream().collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
        System.out.println(map1);*/

        // total department : concept 2
        //emps.stream().map( Employee1::getDepartment).distinct().forEach(System.out::println);//

        // concept 3 : get average m & f
        //Map<String,Double> map = emps.stream().collect(Collectors.groupingBy(Employee1 ::getGender,Collectors.averagingDouble(Employee1 ::getAge)));
       // System.out.println(map);

        // concept 4 : highest paid salary
       /* Optional<Employee1> optional = emps.stream().collect(Collectors.maxBy(Comparator.comparing(Employee1::getSalary)));
        if (optional.isPresent())
        {
            Employee1 employee1 = optional.get();
            System.out.println(employee1);
        } */

        // concept 5 : filter the joining employee joined in 2015
        /* emps.stream().filter(e ->e.joiningYear > 2015 )
                .map(e ->e .name).forEach(name -> System.out.println(name)); */

        // concept 6 : number of employees each department
       /* Map<String,Long> map = emps.stream().collect(Collectors
                .groupingBy(Employee1:: getDepartment,Collectors.counting()));
        System.out.println(map);  */

        // concept 7 : average salary of each department
       /* Map<String,Double> map = emps.stream().collect(Collectors
                .groupingBy(Employee1 ::getDepartment,Collectors.averagingDouble(Employee1 ::getSalary)));
        System.out.println(map); */

        // concept 8 : youngest employee in the development department
       /* Optional<Employee1> optional = emps.stream().filter(e ->e.getGender().equals("Male") &&
                e.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee1::getAge));
        if (optional.isPresent())
        {
            System.out.println(optional.get());
        } */

        // concept 9 :  most working experience employee

       /* Optional <Employee1> optional = emps.stream().collect(Collectors
                .minBy(Comparator.comparing(Employee1::getJoiningYear)));
         if (optional.isPresent())
        {
            System.out.println(optional.get());
        } */

        // concept 10 : how many male and female sales team
       /* Map<String,Long> map = emps.stream().filter(e -> e.getDepartment().equals("SALES"))
                 .collect(Collectors.groupingBy(Employee1 ::getGender,Collectors.counting()));
        System.out.println(map); */

        // concept 11 : 2nd highest salary
        // sort emp based the descending order then skip first record
       /* Optional<Employee1> findFirst = emps.stream().sorted(Comparator.comparing(Employee1::getSalary).reversed())
                .skip(1).findFirst();
        System.out.println(findFirst.get()); */
        // 2nd approach find 2nd highest salary
       /* List<Employee1> collect = emps.stream().sorted(Comparator
                .comparing(Employee1::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(collect.get(1)); */










    }
}
class Employee1
{
    int id ;
    String name ;
    int age ;
    String gender ;
    String department ;
    int  joiningYear ;
    double salary ;
    public  Employee1(int id ,String name ,int age ,String gender ,String department,int joiningYear,double salary)
    {
        this.id = id ;
        this.age = age ;
        this.gender = gender;
        this.joiningYear= joiningYear;
        this.department = department;
        this.name = name ;
        this.salary = salary ;
    }
    public int getId()
    {
        return id ;
    }
    public  void  setId (int id)
    {
        this.id = id;
    }
    public String getName()
    {
        return  name ;
    }
    public void  setName(String name)
    {
        this.name = name;
    }
    public  int  getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age ;
    }
    public String getGender ()
    {
        return gender ;
    }
    public void setGender(String gender)
    {
        this.gender = gender ;
    }
    public  String getDepartment ()
    {
        return  department;
    }
    public void setDepartment(String department)
    {
        this.department = department ;
    }
    public int getJoiningYear()
    {
        return joiningYear ;
    }
    public void  setJoiningYear(int joiningYear)
    {
        this.joiningYear = joiningYear ;
    }
    public double getSalary ()
    {
        return salary ;
    }
    public void setSalary(double salary)
    {
        this.salary = salary ;
    }
   @Override
    public String toString ()
   {
       return "Employee1 [id =" +id + ",name=" +name +",age = " + age +
               ",gender" + gender + ",department" +department + ",joining year"
               +joiningYear + ",salary" +salary+"]";
   }



}
