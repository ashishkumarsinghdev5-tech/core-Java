public class Test3
{
    void display(int...a)
    {
        System.out.println(a);
    }
}
class MethodOverloading7
{
    public static void main(String[] args)
    {
     Test3 t = new Test3();
     t.display();
     t.display(10);
     t.display(20,30);
    }
}
