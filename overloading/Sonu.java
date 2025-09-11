public class Sonu
{
    void show1 ()
    {
        System.out.println(" i am singer");
    }
}
class b extends Sonu
{
   void show2()
   {
       System.out.println(" i an running");
   }
}
class c extends b
{
    void show3()
    {
        System.out.println(" i am singing");
    }

}
class multilevelInheritance
{
    public static void main(String[] args)
    {
        System.out.println("........Sonu object.......");
        Sonu ob1 = new Sonu();
        ob1.show1();
        //ob1.show2();
        //ob2.show3();
        System.out.println(".......B object...........");
        b ob2 = new b();
        ob2.show2();
        ob2.show1();
        //ob2.show3();
        System.out.println(".........c object...........");
        c ob3 = new c();
        ob3.show3();
        ob3.show1();
        ob3.show1();
    }
}
