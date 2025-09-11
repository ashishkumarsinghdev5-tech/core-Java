package Linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpDemo5
{
    public static void main(String[] args)
    {
        ArrayList<Employee> emp = new ArrayList<>();
         emp.add(new Employee(102,"Ashish",120000.00));
        emp.add(new Employee(103,"Aman",100000.00));
        emp.add(new Employee(104,"Lakhmal Singh",130000.00));
        emp.add(new Employee(105,"Anshuman",126000.00));
        emp.add(new Employee(106,"Abhishek",129000.00));
        //Collections.sort(emp,new EmpIdComparator());
       // Collections.sort(emp,new EmpIdComparator());
      //  Collections.sort(emp, new Comparator<Employee>() {
           // @Override
          //  public int compare(Employee e1, Employee e2)
           // {
               // return e1.id - e2.id;
            //}
      //  });
        //Collections.sort(emp, new Comparator<Employee>() {
           // @Override
           // public int compare(Employee e1, Employee e2) {
             //   return e1.name.compareTo(e2.name);
            //}
        //});
        Collections.sort(emp, new Comparator<Employee>()
        {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.salary > e2.salary) {
                    return 1;
                } else if (e1.salary<e2.salary)
                        {
                return -1;
                       }
               else{
                    return 0;
                }

            }
        }
        );
        for (Employee e : emp)
        {
            System.out.println(e);
        }
    }
}
