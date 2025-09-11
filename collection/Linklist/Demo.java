package Linklist;
import java.util.LinkedList;

public class Demo
{
    public static void main(String[] args)
    {
       LinkedList<Integer> ll = new LinkedList<>();
       ll.add(10);// one node
       ll.add(20);// one node
       ll.add(30);// one node
        ll.add(50); // one node
        ll.add(60); // one node
       ll.add(70); // one node
        System.out.println(ll); // 10,20,30,40,50,60,70
        System.out.println(ll.get(0)); //10
        ll.add(1,15);
        System.out.println(ll); // 10 ,15,20,30,40,50.60.70

    }
}
