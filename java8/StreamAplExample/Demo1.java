package StreamAplExample;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo1
{
    public static void main(String[] args)
    {
        //approach 1
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);
        ArrayList<String> names = new ArrayList<>();
        names.add("Ashish");
        names.add("ashok");
        names.add("Sharda");
        names.add("Pankaj");
        // approach 2
        Stream<String> stream2 = names.stream();

    }
}
