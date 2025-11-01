package multiThread;

class myThread2 extends Thread
{
    public void run()
    {
        System.out.println("hi");
    }
}
class myThread3 extends Thread
{
    public void run()
    {
        System.out.println("Ashish");
    }
}
class myThread4 extends Thread
{
    public void run()
    {
        System.out.println("hello");
    }
}

public class ThreadDemo3
{
    public static void main(String[] args)
    {
        myThread2 t1 = new myThread2();
        t1.start();
        myThread3 t2 = new myThread3();
        t2.start();
        myThread4 t3 = new myThread4();
        t2.start();
    }
}