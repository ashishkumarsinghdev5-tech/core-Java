public class A2
{
    void show1 ()
    {
        System.out.println(" i am singer");
    }
}
class B1 extends A2
{
    void show2()
    {
        System.out.println(" i an running");
    }
}
class C1 extends b1
{
    void show3()
    {
        System.out.println(" i am singing");
    }

}
class Hierarchical
{
    public static void main(String[] args)
    {
        System.out.println("........Sonu object.......");
        A2 ob1 = new A2();
        ob1.show1();
        //ob1.show2();
        //ob2.show3();
        System.out.println(".......B object...........");
        B1 ob2 = new B1();
        ob2.show2();
        ob2.show1();
        //ob2.show3();
        System.out.println(".........c object...........");
        C1 ob3 = new C1();
        ob3.show3();
        ob3.show1();

    }
}


