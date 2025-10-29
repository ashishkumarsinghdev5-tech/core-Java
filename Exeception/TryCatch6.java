package Exeception;
// single catch block multi exeception handle

public class TryCatch6
{
    public static void main(String[] args)
    {
      try
      {
          System.out.println(100/0);
          int [] a= {10,20,30,40,50};
          System.out.println(a[6]);
      }
      catch (ArithmeticException | ArrayIndexOutOfBoundsException e )
        {
            System.out.println(e);
        }
    }
}
