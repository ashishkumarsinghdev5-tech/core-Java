package StreamAplExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// parallel method using the example

public class Demo13
{
    public static void main(String[] args)
    {
        System.out.println("=====serial thread ========");
        Stream<Integer> ss = Stream.of(1,2,3,4,5);
        ss.forEach(n -> System.out.println(n + "::" + Thread.currentThread()));
        System.out.println("======== parallel stream ========");
        Stream<Integer> ps = Stream.of(1,2,3,4,5);
        ps .parallel().forEach(n -> System.out.println(n + "::" + Thread.currentThread()));

    }
}
