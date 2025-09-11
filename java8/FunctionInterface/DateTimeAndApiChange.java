package FunctionInterface;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeAndApiChange
{
    public static void main(String[] args) throws Exception
    {
        Date d = new Date();
        System.out.println(d);
        // convert to Date to String
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String format = sdf.format(d);
        System.out.println(format);  // indian format dd/mm/yyyy
        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
        String format2 = sdf2.format(d);
        System.out.println(format2); // usa format mm/dd/yyyy
        // convert String to date
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy/MM/dd");
        Date parsedDate = sdf3.parse( "2025/12/20");
        System.out.println(parsedDate);
        java .sql.Date D = new java.sql.Date(222232455);
        System.out.println(D);
    }
}
