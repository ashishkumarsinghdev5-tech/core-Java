public class instanceMethodRef
{
    public void m1()
    {
        for (int i=1; i<=5 ;i++ )
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        instanceMethodRef im  = new instanceMethodRef(); // run is static method
        Runnable r = im:: m1 ;  // run method to ref m1 method , runnable method to ref m1 is calling
        Thread t = new Thread(r);
        t.start();
    }
}
