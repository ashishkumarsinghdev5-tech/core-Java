package multiThread;

public class ThreadDemo5
{
    void divide()
    {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }
    public static void main(String[] args)
    {
        Thread.currentThread().setName("Ashish");
     ThreadDemo5 t = new ThreadDemo5() ;
     t.divide();
    }
}
