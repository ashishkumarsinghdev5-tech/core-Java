package Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// note : - child class parent class above rather then program not executed

public class TryCatch4
{
    public static void main(String[] args)
    {
        System.out.println("4");
        try
        {
            System.out.println(100/0);

        }
        catch (Exception e)
        {
            System.out.println("5");
        }
        catch (Throwable e) // throwable  is parents class
        {
            System.out.println("3 ....................");
        }


        System.out.println("7");
    }

}
