package multiThread;
// run(),start(),currentThread(),is active (),get name() ,set name()

public class ThreadDemo6 extends Thread
{
  public void run()
  {
      System.out.println("hii");
      System.out.println("old child thread  : " +Thread.currentThread().getName());
      Thread.currentThread().setName("my_child_thread");
      System.out.println("new child thread  : " +Thread.currentThread().getName());
  }

    public static void main(String[] args)
    {
        System.out.println("old main  thread : " +Thread.currentThread().getName());
        Thread.currentThread().setName("my_main_thread");
       ThreadDemo6 t = new ThreadDemo6();
        System.out.println("new main  thread : " +Thread.currentThread().getName());
       t.start();
       // System.out.println("old name : " + t.getName());
    }
}
