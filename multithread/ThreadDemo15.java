package multiThread;

 class ThreadDemo15 extends Thread
{
    public void run()
    {
        for( int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }

    public static void main(String[] args)
    {
       ThreadDemo15 t = new ThreadDemo15();
       t.start();
       ThreadDemo15 t1 = new ThreadDemo15();
       t1.start();

    }
}
