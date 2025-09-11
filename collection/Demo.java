import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        ArrayList<Student> a1 = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        String name = s.next();
        a1.add(new Student(id,name));
        id =  s.nextInt();
        name = s.next();
        a1.add(new Student(1, "Raju "));
        a1.add (new Student(2,"Ashish"));
        a1.add(new Student(3,"Ramesh"));
        a1.add(new Student(4,"Asim"));
        ListIterator<Student>li = a1.listIterator();
        while (li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.println("==============");
        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
        System.out.println("hello");
    }
}
