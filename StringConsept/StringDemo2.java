package StringConsept;

public class StringDemo2
{
    public static void main(String[] args)
    {
       String str1 = "Ashish@123" ;
       String str2 = "123@";
       if (str1.equals("Ashsh@123") && str2.equals("123@"))
       {
           System.out.println("Log in successfully");

       }
       else
       {
           System.out.println(" log in failed ");
       }

    }
}
