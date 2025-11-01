package multiThread;
//Thread performing single task from multiple thread
class myThread extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class ThreadDemo2
{
    public static void main(String[] args)
    {
       myThread t1 = new myThread();
       t1.start();
       myThread t2 = new myThread();
       t2.start();
    }
}
