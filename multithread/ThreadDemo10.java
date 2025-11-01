package multiThread;

class ThreadDemo10 extends Thread
{
  public void run()
  {
      System.out.println("hii");
  }

    public static void main(String[] args)
    {
       ThreadDemo10 t = new ThreadDemo10();
       t.start();
     //  t.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t.getPriority());
    }
}
