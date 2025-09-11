import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
            // function interface (2.3 - consumer )
    {
       Consumer<String> c = (name) -> System.out.println(name +",Good Evening");
       c.accept("Ashish");
        c.accept("Aman");
        c.accept("Amar");
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        // for loop
        // for each loop ( consumer used for each method )  1.8 version
        // iterator
        // list iterator
        numbers.forEach(i -> System.out.println(i));


    }
}
