package FailFastDemo;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo10
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm = new HashMap<>();
        // hm will compare content of  keys to find duplicate keys
        hm.put("Ashok",102); // 1 entry add
        hm.put("Amu",103);// 1 entry add
        hm.put("Sam",104); //1 entry add
        hm.put(new String("Ashok"),105); // it will replace the value is duplicate  keys
        System.out.println("Size ::" +hm.size());
        System.out.println(hm);
        System.out.println("=====================");
        IdentityHashMap<String,Integer> ihm = new IdentityHashMap<>();
        // ihm will compare content of  keys to find duplicate keys (===)
        ihm.put("Ashok",102); // 1 entry add
        ihm.put("Amu",103); // 1 entry add
        ihm.put("Sam",104); // 1 entry add
        ihm.put(new String("Ashok"),105); // 1 entry add
        ihm.put("Ashok" ,106); // it will replace the value is duplicate  keys(first value)
        System.out.println("IHM-Size ::" +ihm.size());
        System.out.println(ihm);
    }
}
