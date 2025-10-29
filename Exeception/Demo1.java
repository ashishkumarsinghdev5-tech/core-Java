package Exeception;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1
{
    public static void main(String[] args)
    {
       try
       {
            FileInputStream fis =new  FileInputStream("");
            int i = fis.read();
           System.out.println(i);
       }
       catch (FileNotFoundException e)
       {
           System.out.println(e);
       }
       catch (IOException e)
       {
           System.out.println(e);
       }

    }
}
