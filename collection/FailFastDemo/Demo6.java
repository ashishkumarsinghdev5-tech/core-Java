package FailFastDemo;

import java.util.ArrayList;

public class Demo6
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(2000);
        al.add(200);
        al.add(3000);
        for (int i: al )
        {
            System.out.println(i    );
        }
    }
}
