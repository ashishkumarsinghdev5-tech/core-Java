package Set;
import java.util.HashSet;
import java.util.Iterator;
class Student {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }
    @Override
    public String toString() {
        return  id  + " "+ name;
    }
}
public class Hashobject
        {
            public static void main(String[] args)
            {
             HashSet<Student> hs = new HashSet<>();
             hs.add(new Student(101,"raju"));
             hs.add(new Student (102,"Rani"));
             hs.add(new Student (103,"Shahil"));

              Iterator<Student> iterator= hs.iterator();
             while (iterator.hasNext())
            {
                System.out.println(iterator.next());
            }


            
    }

}

