package FailFastDemo;

import java.util.concurrent.CopyOnWriteArrayList;

public class Demo7
{
    public static void main(String[] args)
    {
        // fail safe collection
        CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<>();
        al.add(1000);
        al.add(200000);
        al.add(621786);
        al.add(123235);
        for(int i : al)
        {
            System.out.println(i);
            if (i== 1000 )
            {
                al.add(1500);
            }
        }
        System.out.println(al);
    }
}
