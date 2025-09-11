package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HasMap
{
    public static void main(String[] args)
    {
        Student1 s1 = new Student1(101,"Ashish",3);
        Student1 s2 = new Student1(102,"Kamal",4);
        Student1 s3 = new Student1(103,"Rahul",6);
        Map<Integer,Student1> map = new HashMap<Integer,Student1>();
        map.put(1,s1);
        map.put(2,s2);
        map.put(3,s3);
        /*Set<Integer> keySet = map.keySet();
        for(Integer key :keySet)
        {
            System.out.println(map.get(key));
        }*/
        Set<Entry<Integer,Student1>>entrySet =  map.entrySet();
        for(Entry<Integer,Student1>  entry:entrySet)
        {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
