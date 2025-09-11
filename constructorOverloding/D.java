public class D
{
    D()
    {
        System.out.println("d");
    }

    public static void main(String[] args)
    {
       D.test () ;
       D a1  =new D ();
       D.test2();
    }
    public static void test  ()
    {
        System.out.println("test 1");
    }

    public static void test2()
    {
        System.out.println("test 2");
    }
}
