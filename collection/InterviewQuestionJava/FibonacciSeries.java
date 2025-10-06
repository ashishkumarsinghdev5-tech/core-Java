package InterviewQuestionJava;

public class FibonacciSeries
{
    public static void main(String[] args)
    {
      int n= 10 ,num1=0 , num2= 1 ;
        System.out.println("FibonacciSeries :" +num1+","+num2 );
        for(int i= 2 ; i<n ; i++ )
        {
            int num3 = num1 + num2 ;
            System.out.println("," +num3);
            num1 = num2;
            num2 = num3 ;
            /*  below just be logic to implement
            Iteration trace (with n = 10)

          We start num1=0, num2=1. Loop runs for i = 2..9 (8 iterations):

           i	num1 (before)	num2 (before)	num3 = num1+num2	printed value
           2	0	                       1	         1	            ,1
           3	1	                       1	         2	            ,2
           4	1	                       2	         3	            ,3
           5	2	                       3	         5	            ,5
           6	3	                       5	         8	            ,8
           7	5	                       8	        13	            ,13
           8	8	                       13	        21	            ,21
           9	13    	                       21	        34	            ,34 */

        }

    }
}
