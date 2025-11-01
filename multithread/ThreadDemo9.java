package multiThread;

class ThreadDemo9 extends Thread
{
  public void run()
  {
      System.out.println("hi :" +Thread.currentThread().getName());
      //System.out.println("child thread priority :" +Thread.currentThread().getPriority());
  }


    public static void main(String[] args)
    {
        ThreadDemo9 t = new ThreadDemo9();
        t.start();
       // t.setPriority(8);
        System.out.println("child thread priority :"+t.getPriority());
        Thread.currentThread().setPriority(8);
        System.out.println("hello :" +Thread.currentThread().getName());
        System.out.println("main thread priority :" +Thread.currentThread().getPriority());
    }
}

