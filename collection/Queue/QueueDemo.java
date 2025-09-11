package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;
// priorityQueue
//Example

public class QueueDemo
{
    public static void main(String[] args)
    {
        PriorityQueue<String>queue = new PriorityQueue<>();
        queue.add("Ashish");
        queue.add("Sam");
        queue.add("Ram");
        queue.add("Suresh");
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        Iterator<String> iterator = queue.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
queue.remove();
        queue.poll();


    }
}
