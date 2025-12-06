package multiThread;

class ThreadJoinDemo extends Thread
{
    Thread t ;
    ThreadJoinDemo(Thread t)
    {
      this.t=t;
    }
    public void run() {
        System.out.println("hii " );

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("hii :" + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(String[] args)
    {
        Thread t1=Thread.currentThread();
      ThreadJoinDemo t2 = new ThreadJoinDemo(t1);
      t2.start();
        System.out.println("hello");
        try
        {   t2.join();// this line be executed by main thread ,thus main thread will wait
                       // for another thread (thread =0) to complete task
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
