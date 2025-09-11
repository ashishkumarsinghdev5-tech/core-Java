package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4
{
    public static void main(String[] args)
    {
        Map<String,Integer> map = new HashMap<>();
        map.put("John",101);
        map.put("Devid",101);
        map.put("Smith",102);
        map.put("Ashish",103);
        System.out.println("Map Size ::" + map.size());
        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(298));
        Set<String> keyset = map.keySet();
        
        System.out.println(map.containsKey(103));
        System.out.println(map.containsKey(298));
        System.out.println();
        System.out.println(map.isEmpty());
        System.out.println(map);
        map.clear();
        System.out.println(map.size());




    }
}
