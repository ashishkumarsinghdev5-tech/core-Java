package HashDemo;
import  java.util.HashSet;
import  java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo4
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(null);
        lhs.add(40);
        lhs.add(50);
        System.out.println(lhs);


    }

}
