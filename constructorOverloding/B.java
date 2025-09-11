public class B
{
    B(int x)
    {
        System.out.println(x);
    }
    B(int x,String y)
    {
        System.out.println(x);
        System.out.println(y);
    }
    B(int x , char y)
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        B a1 = new B(100);
        B a2 = new B ( 100, "A" );
        

    }
}
