package StreamAplExample;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
// spatial iterator for example

public class Demo14
{
    public static void main(String[] args)
    {
       List<String> names = Arrays.asList("Sachin","Saba","Ver","Sam");
        Spliterator<String> spliterator = names.stream().spliterator();
        spliterator.forEachRemaining(n -> System.out.println(n));
    }
}
