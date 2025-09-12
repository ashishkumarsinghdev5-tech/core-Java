public class A
{
    A(int x)// no of argument 1: integer
    {
        System.out.println(x);
    }
    A(String x)// no of argument 2 : string
    {
        System.out.println(x);
    }
    A(double x)// no of argument 3 : double
    {
        System.out.println(x);
    }

    public static void main(String[] args)
    {




        A a1 = new A ("mike");
        A a2 = new A (100);
        A a3 = new A ( 500.45);
        A a4 = new A ( 10000.23);
        A a5 = new A ("ashish");

    }
}
