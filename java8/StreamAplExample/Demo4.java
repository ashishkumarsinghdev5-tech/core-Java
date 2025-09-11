package StreamAplExample;

import java.util.Arrays;
import java.util.List;

public class Demo4
{
    public static void main(String[] args)
    {
       List<String> names = Arrays.asList("Indian ","Usa","uk","japan");
      // legacy logic
      /* for (String name : names)
       {
           System.out.println(name.toUpperCase());
       } */
        names.stream().map(name -> name.toLowerCase()).forEach(n -> System.out.println(n));
        // convert to map and int
        names.stream().mapToInt(name -> name.length()).forEach(i -> System.out.println(i));

    }
}
