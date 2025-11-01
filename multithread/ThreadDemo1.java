package multiThread;
//Thread performing single task from single
class myThread1 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
public class ThreadDemo1
{
    public static void main(String[] args)
    {
        myThread1 t1 = new myThread1();
        t1.start();
    }
}
