package FunctionInterface;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;
import java.time.Duration;


public class DateAndTimeApi // OverCom the problem Date and time using java 8 feature
{
    public static void main(String[] args)
    {
      // Date d1 = new Date();
      //  System.out.println(d1);
        LocalDate date =  LocalDate.now(); // date
        System.out.println(date);
        date = date.plusDays(3); // add the days
        System.out.println(date);
        date = date.plusMonths(8); // add the month
        System.out.println(date);
        date = date.plusYears(9); // add the year
        System.out.println(date);
        System.out.println("==================");
        System.out.println("concept local date , leap year in java 8");
        // local date concept
        // leap year Concept in java 8 Ready mate method boolean leap year
        boolean leapYear = LocalDate.parse("2021-12-23").isLeapYear();
        System.out.println("Leap year ::" + leapYear );
        // leap year check next and previous year is leap year also be ready mate method java 8
        boolean before = LocalDate.parse("2021-12-08").isBefore(LocalDate.parse("2022-12-09"));
        System.out.println("Before Date ::" + before);
        System.out.println("==========================================");
        System.out.println("local time concept");
        // local time concept
        LocalTime time = LocalTime.now();
        System.out.println(time);
        time = time.plusHours(2);
        System.out.println(time);
        time = time.plusMinutes(30);
        System.out.println(time);
        time = time.minusHours(3);
        System.out.println(time);
        time = time.minusMinutes(40);
        System.out.println(time);
        System.out.println("==========================");
        System.out.println("local date time concept");
        // local date time concept
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("=================================");
        System.out.println("period class concept,concept year gap , month ,days");

        //period class concept
       // Period P = Period.ofDays(5);
       // System.out.println(P.getDays());

        // concept year gap , month ,days
        Period Between = Period.between(LocalDate.parse("1956-12-12"),LocalDate.now());
        System.out.println(Between.getYears());
        System.out.println(Between.getMonths());
        System.out.println(Between.getDays());

    }
}
