package CollectionSorting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(3);
        a1.add(45);
        a1.add(5);
        a1.add(36);
        a1.add(70);
        // sort the collection
        System.out.println("Before the sort : " + a1);
        Collections.sort(a1);
        System.out.println("After the sort : " + a1);
        // reverse the collection
        Collections.reverse(a1);
        System.out.println("After reverse the sort : " + a1);

    }
}
