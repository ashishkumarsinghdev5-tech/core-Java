package StreamAplExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2
{
    // java 7 style , // Java 7 style enhanced for-loop
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,20,30,40,50,60);
        /*for (Integer i :list)
         if(i > 20) // first approach
        {
            System.out.println(i);
        }
        (b it is legacy approach )
        }*/
        // its a latest approach java 8  long and details
          /*Stream<Integer> stream = list.stream();
           Stream<Integer> filter = stream.filter(i -> i  > 20);
           filter.forEach(i -> System.out.println(i));
           /*
           */
        // for sort cut way to apply in java 8

          list.stream().filter(i -> i> 20 ).forEach(i -> System.out.println(i));


    }
}
