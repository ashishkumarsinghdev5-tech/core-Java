package Linklist;

import HashMap.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo3
{
    public static void main(String[] args)
    {
        List<Student> a1 = new ArrayList<>();
        a1.add(new Student(108 ,"Kamal",5));
        a1.add(new Student(102 ,"paw",4));
        a1.add(new Student(103 ,"Aan",1));
        Collections.sort(a1);
        for (Student s : a1 )
        {
            System.out.println(s);
        }

    }
}
