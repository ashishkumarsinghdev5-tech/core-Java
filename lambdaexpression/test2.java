public class test2
{
    test2()
    {
        System.out.println("test2");
    }
    test2(int x,int y)
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        test2 a1 = new test2();
        test2 a2 = new test2(100,600);
        test2 a3 = new test2(200,300);
        test2 a4 = new test2();



    }

}
