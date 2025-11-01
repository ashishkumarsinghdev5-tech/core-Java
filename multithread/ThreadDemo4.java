package multiThread;

public class ThreadDemo4 extends Thread
{
    public void run()
    {
        System.out.println("hi");
        System.out.println("1 :"+Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {
      ThreadDemo4 t1 = new ThreadDemo4();
      Thread t = new Thread(t1,"Ashish");
        t1.start();
        System.out.println("2 :"+Thread.currentThread().getName());
        System.out.println(t1.isAlive());
    }
}
