package multiThread;

class ThreadJoinMethod extends Thread
{
  public void run()
  {
      System.out.println("hi :");
      try
      {
          for (int i=1;i<=5;i++)
          {
              System.out.println("hello :" +i);
          }
      } catch (Exception e)
      {
          System.out.println(e);
          
      }
  }

    public static void main(String[] args)
    {
      ThreadJoinMethod t =new ThreadJoinMethod();
      t.start();
        System.out.println("hello");
        try
        {
            for (int i=1;i<=5;i++)
            {
                System.out.println("hello :" +i);
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
