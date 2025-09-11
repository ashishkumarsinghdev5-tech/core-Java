package Linklist;

public class Employee
{
    String name ;
    int id;
    Double salary ;
    public Employee(int id , String name ,Double salary)
    {
        super();
        this.id= id ;
        this.name = name ;
        this.salary = salary;
    }
    @Override
    public String toString()
    {
        return "Employee[id=" + id +",name=" +name + ", salary " + salary + "]";
    }
}
