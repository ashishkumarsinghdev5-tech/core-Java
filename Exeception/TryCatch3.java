package Exeception;
// Runtime Exeception  example
// Arithmetic exeception occure consept apply

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch3
{
    public static void main(String[] args)
    {
        System.out.println("4");
        try
        {
            System.out.println("2");
            System.out.println(100/0);

        }
        catch (RuntimeException  e)
        {
            System.out.println("3 ....................");
        }

        System.out.println("7");
    }

}
