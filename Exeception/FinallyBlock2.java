package Exeception;

public class FinallyBlock2
{
    public static void main(String[] args)
    {
       try
       {
           System.out.println(100/2);
       }
       catch (Exception e)
       {
           System.out.println(e);
       }
       finally
       {
           System.out.println("hiii");
       }
    }
}
