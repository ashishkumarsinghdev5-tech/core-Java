//package multiThread;

public class SynchronizationDemo
{
    public static void main(String[] args)
    {
        Thread t = new Thread()
        {
            public void run()
            {
                System.out.println("hii");
            }
        };
        t.start();

        Thread t1 = new Thread()
        {
            public void run()
            {
                System.out.println("hello");
            }
        };
        t1.start();
    }
}
