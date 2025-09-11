import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
// Example of Fail fast collection

public class Demo8
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(102,"Akash");
        map.put(103,"Deva");
        map.put(104,"Amm");
        map.put(105,"one ");
        map.put(106,"two");
        map.put(107,"Three");
        map.put(108,"four");
        Set<Integer> keyset = map.keySet();
        Iterator<Integer> iterator = keyset.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
