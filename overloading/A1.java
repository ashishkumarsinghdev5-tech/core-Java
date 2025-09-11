public class A1
{
    void show1 ()
    {
        System.out.println(" i am singer");
    }
}
class b1 extends A1
{
    void show2()
    {
        System.out.println(" i an running");
    }
}
class c1 extends b1
{
    void show3()
    {
        System.out.println(" i am singing");
    }

}
class multilevel
{
    public static void main(String[] args)
    {
        System.out.println("........Sonu object.......");
        A1 ob1 = new A1();
        ob1.show1();
        //ob1.show2();
        //ob2.show3();
        System.out.println(".......B object...........");
        b1 ob2 = new b1();
        ob2.show2();
        ob2.show1();
        //ob2.show3();
        System.out.println(".........c object...........");
        c1 ob3 = new c1();
        ob3.show3();
        ob3.show1();
        ob3.show1();
    }
}

