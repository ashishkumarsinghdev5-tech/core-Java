package FailFastDemo;
import java.util.WeakHashMap;

public class Demo11
{
    public static void main(String[] args)
            // weak hash map
    {
        WeakHashMap<Integer,String> whm = new WeakHashMap<>();
        whm.put(1 , "hi ");
        whm.put(2, "hello");
        whm.put(4,"say");
        whm.put(3,"bye");
        System.out.println(whm);


    }
}
