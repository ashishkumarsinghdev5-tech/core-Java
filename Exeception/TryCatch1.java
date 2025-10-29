package Exeception;
//(try & catch arithmetic exception    tin fif

public class TryCatch1
{
    public static void main(String[] args)
    {
        System.out.println("4");
        try
        {
            System.out.println("1000/0");
            System.out.println("1");
                     }
        catch (ArithmeticException  e)
        {
            System.out.println("3");
        }
        System.out.println("7");
    }

}
