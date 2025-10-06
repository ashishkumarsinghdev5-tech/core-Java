package InterviewQuestionJava;

public class PrimeCheck 
    // Prime Number check 
{
    public static void main(String[] args) 
    {
        int num = 11 ;
        boolean isPrime = true ;
        for (int i = 2 ;i <= Math.sqrt(num);i++)
        /* A for loop that checks potential divisors i from 2 up to Math.sqrt(num) (inclusive )
        Reason: if num has a nontrivial factor,
               at least one of the pair of factors ≤ √num, so you only need to test up to √num.
        Note 1 : Math.sqrt(num) returns a double. Calling it every iteration is slightly wasteful;
              better compute it once or use an i*i <= num style check (see improvements below).
           2  : Math.sqrt(num) in Java means “call the static method sqrt from the Math class
                to compute the square root of num, returning it as a double.”
         */
        {
            if (num % i==0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
        /*
        Math.sqrt(11) ≈ 3.316 →     loop runs with i = 2, 3.
         i = 2:       11 % 2 != 0 → continue (no divisor).
         i = 3:       11 % 3 != 0 → continue (no divisor).
    Loop ends →isPrime still true → prints true. */
    }  
}
