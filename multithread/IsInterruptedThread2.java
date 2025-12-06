

public class IsInterruptedThread2 extends Thread
{
    public void run()
    {
        System.out.println("is thread interrupted (1):"+ Thread.currentThread().isInterrupted());
        try
        {
            for (int i=1;i<=5;i++)
            {
                System.out.println("hello :" +i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("is thread interrupted (2):"+ Thread.currentThread().isInterrupted());
        IsInterruptedThread2 t = new IsInterruptedThread2();
        t.start();
        t.interrupt();
    }
}
