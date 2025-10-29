package Exeception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
// Checked Exception

public class Demo3
{
    public static void main(String[] args)
            throws FileNotFoundException
    // ArrayIndexOutOfBoundsException,ArithmeticException
    {
        System.out.println("1");
        try {
        // FileInputStream fis = new FileInputStream(""); //FileNotFoundException
            System.out.println("2");
       int a = 100 ,b=2 ,c; //ArithmeticException
            System.out.println("4");
        c= a/b;
        System.out.println(c);
            System.out.println(".....Thank you ............");

    }catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println(",,,,,,,,,, execute code,,,.....");

}
}
