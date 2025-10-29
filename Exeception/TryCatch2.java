package Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// compile time exception

public class TryCatch2
{
    public static void main(String[] args)
    {
        System.out.println("4");
        try
        {
            System.out.println("100/0");
            FileInputStream fis = new FileInputStream("");
            System.out.println("1");
        }
        catch (ArrayIndexOutOfBoundsException  e)
        {
            System.out.println("3 ....................");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("3 !!!!!!!!!!!!");
        }
        System.out.println("7");
    }

}
