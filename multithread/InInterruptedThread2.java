

public class InInterruptedThread2 extends Thread
{
    public void run()
    {
        System.out.println("is thread interrupted (1):"+ Thread.interrupted());
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
        System.out.println("is thread interrupted (2):"+ Thread.interrupted());
        InInterruptedThread2 t = new InInterruptedThread2();
        t.start();
        t.interrupt();
    }
}
