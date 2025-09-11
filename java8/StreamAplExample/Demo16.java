package StreamAplExample;

import java.util.Arrays;

public class Demo16
    // how to perform some given number ?
    // sum of the number
{
    public static void main(String[] args)
    {
      int[] num = {1,2,3,4,5,6,7};
     /* int sum = 0 ;
      for (int i : num)
      {
          sum = sum + i ;
      }
        System.out.println(sum); */
        // concept to use in reduce
        int reduce = Arrays.stream(num).reduce(0,(a,b) ->a+b);
        System.out.println(reduce);
    }
}
