package Exeception;

public class Demo6
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(1100/2);
            int [] a = {10,20,30,40,50,60};
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println("Array index bounded");
        }
        catch (ArithmeticException e)
        {
            System.out.println("you can not be divided");
        }

    }
}
