package FunctionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//  with the use ascending order with lambda expression
public class LambdaExpressionDemo1
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
        Collections.sort(al, (i ,j ) -> (i> j) ? - 1 : 1);
        System.out.println("after sort :" + al);
    }
}


