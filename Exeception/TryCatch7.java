package Exeception;

import java.sql.Connection;
import java.sql.DriverManager;

public class TryCatch7
{
    public static void main(String[] args)
    {
        Connection con = null; ;
      try {
          Class.forName("");

           con = DriverManager.getConnection("","","");

      }
      catch (Exception e )
      {
          System.out.println(e);
      }
     /* finally
      {
       try
       {
         con.close();
       }
       catch (Exception e)
       {

       }
      }*/
    }
}
