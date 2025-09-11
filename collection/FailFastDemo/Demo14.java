package FailFastDemo;


import java.util.Calendar;
import java.util.Date;

public class Demo14
        // java util package (Calender , date ,class example )
{
    public static void main(String[] args)
    {
        Date d = new Date();
        System.out.println(d);
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));

    }
}
