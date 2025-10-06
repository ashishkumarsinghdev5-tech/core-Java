package InterviewQuestionJava;

public class Factorial
    // Factorial of a Number
{
    public static void main(String[] args)
    {
       int num = 5 ,factorial = 1 ;
       for ( int i = 1 ; i<= num ;i++)
       {
           factorial *= i ;
       }
        System.out.println(factorial);
       // below explain the logic
       /*Iteration trace for num = 5
        I	action	       factorial (after step)
        1	fact = 1 * 1	 1
        2	fact = 1 * 2	 2
        3	fact = 2 * 3	 6
        4	fact = 6 * 4	 24
        5	fact = 24 * 5	 120 */
    }
}
