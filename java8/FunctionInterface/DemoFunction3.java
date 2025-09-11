package FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// wap to Store numbers in arrayList and Sort numbers in Descending order without use lambda
//  with the use ascending order with lambda expression
public class DemoFunction3
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(20);
        al.add(234);
        al.add(12321);
        al.add(122222);
        al.add(121312);
        System.out.println("Before sort : " + al);
       // Collections.sort(al,new NumberComparator());
        //Collections.sort(al,(i,j)  -> i.compareTo(j));
       // String i = 10> 20 ? " hii" : " hello " ;
        Collections.sort(al, (i ,j ) -> (i> j) ? - 1 : 1);
        System.out.println("after sort :" + al);
    }
}
class NumberComparator implements Comparator<Integer>
{
    @Override
    public int compare (Integer i ,Integer j)
    {
        if (i>j)
        {
            return -1;
        }
        else if (i<j)
        {
            return +1;
        }
        else
        {
            return  0 ;
        }
    }
}
