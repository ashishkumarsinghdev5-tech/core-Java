package multiThread;
class Ticket extends Thread
{
    int total_earning=0;
    int ticket_price=100;
    public void run()
    {
        synchronized (this)
        {
            for (int i = 1; i <= 10; i++)
            {
                total_earning = total_earning + ticket_price;
            }
            this.notify();
        }
    }
}
public class TrainEarning
{
    public static void main(String[] args)
    {
        Ticket t = new Ticket();
        t.start();
        synchronized (t)
        {
            try
            {
                Thread.sleep(1000);
                t.wait();
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        System.out.println("total earnings " + t.total_earning);





    }
}
