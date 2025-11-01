package multiThread;

class MultiThreadDemo1 implements Runnable
{
  @Override
    public void run()
  {
      for (int i=0;i<=10 ;i++)
      {
          System.out.println("Child Thread :" +i);
      }
  }
  void show()
  {
      System.out.println("hii");
  }
}
 class Test1
{
    public static void main(String[] args)
    {
        MultiThreadDemo1 t1 = new MultiThreadDemo1();
        Thread t = new Thread(t1);
        t.start();
        for (int i=0 ;i<10 ;i++)
        {
            System.out.println("main thread" +i);
        }
        t1.show();
    }
}
