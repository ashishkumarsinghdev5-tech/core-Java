package multiThread;

public class ThreadDemo8 extends Thread
{
   public void run()
   {
       System.out.println("hi");
       System.out.println("child thread :"+Thread.currentThread().isDaemon());
   }

    public static void main(String[] args)
    {
        ThreadDemo8 t = new ThreadDemo8();
        t.setDaemon(true);
        t.start();
        System.out.println("main thread :"+Thread.currentThread().isDaemon());
    }
}
