package Exeception;
// multi catch block example

public class TryCatch5
{
    public static void main(String[] args)
    {
       try
       {
           System.out.println(100/0);
           int [] a = {10,20,30,40,50};
           System.out.println(a[5]);
       }
       catch (ArithmeticException e)
       {
           System.out.println("yau can not dived by zero");
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println("index out of bound exception ");
           System.out.println("please provide  correct value from  array  ");
       }
    }
}
