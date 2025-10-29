package Exeception;

import java.io.FileInputStream;

public class FinallyBlock
    // finally block is alwayes be use in after try & catch block rather
        // occur block execute yes or not
{
    public static void main(String[] args)
    {
        FileInputStream fis = null;
      try
      {
           fis = new FileInputStream("");
          System.out.println("3");
          fis.read();

      }
      catch (Exception e)
      {
          System.out.println(e);
      }
      finally
      {
          try
          {
              fis.close();
          }
          catch (Exception e )
          {
              System.out.println(e);
          }
      }
    }
}
