package multiThread;
class ThreadYieldMethod extends Thread
{
    public void run()
    {
        for(int i=0;i<10 ;i++)
            {
                System.out.println(i+":"+Thread.currentThread().getName());
            }

    }

    public static void main(String[] args)
    {
        ThreadYieldMethod t = new ThreadYieldMethod();
        t.start();
        Thread.yield();
        for(int i=0;i<10 ;i++)
        {
            System.out.println(i+":"+Thread.currentThread().getName());
        }

    }
}
