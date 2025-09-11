package StreamAplExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo7
{
    public static void main(String[] args)
    {
        List<String> javacourses = Arrays.asList("core java" , "Advanced java ","Spring Boot");
        List<String> uicourses = Arrays.asList("html" , "sql ","xml");
        List<List<String>> courses  = Arrays.asList(javacourses,uicourses);
      //courses.stream().forEach(c -> System.out.println(c));
        Stream<String> flatMap = courses.stream().flatMap(s ->s.stream());
        flatMap.forEach(c -> System.out.println(c));
    }
}
