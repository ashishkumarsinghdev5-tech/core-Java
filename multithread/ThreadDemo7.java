package multiThread;

public class ThreadDemo7 extends Thread
{
   public void run()
   {
       System.out.println("hi");
       System.out.println("child thread :"+Thread.currentThread().isDaemon());
   }

    public static void main(String[] args)
    {
     ThreadDemo7 t = new ThreadDemo7();
     t.setDaemon(true);
     t.start();
        System.out.println("main thread :"+Thread.currentThread().isDaemon());
    }
}
