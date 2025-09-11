package FailFastDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
// Example of ConcurrentHashMap (Fail safe)

public class Demo9
{
    public static void main(String[] args)
    {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
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
            map.put(109,"pooja");
        }
        System.out.println(map);
    }
}
