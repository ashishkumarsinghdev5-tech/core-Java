package multiThread;

class InterruptedThread1 extends Thread
{
   public void run()
   {
       try
       {
           for (int i=1;i<=5;i++)
           {
               System.out.println("hello :" +i);
               Thread.sleep(1000);
           }
       } catch (Exception e)
       {
           System.out.println(e);

       }
       try
       {
           for (int i=1;i<=5;i++)
           {
               System.out.println("hello :" +i);
               Thread.sleep(1000);
           }
       } catch (Exception e)
       {
           System.out.println(e);

       }
   }

    public static void main(String[] args)
    {
       InterruptedThread1 t = new InterruptedThread1();
       t.start();
      t.interrupt();
        t.interrupt();
    }
}
