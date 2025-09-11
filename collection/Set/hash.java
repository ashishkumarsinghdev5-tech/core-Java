package Set;

import java.util.HashSet;
import java.util.Iterator;

public class hash
{
    public static void main(String[] args)
    {
        HashSet<String> hs = new HashSet<>(100,10.5f);
        hs.add("one ");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("null");
        System.out.println(hs);
        hs.remove("three");
        System.out.println(hs);
        Iterator<String>iterator= hs.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
