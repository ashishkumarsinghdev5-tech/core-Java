
public class classA
{
    void show1()
    {
        System.out.println("I am eating");
    }

}

class B extends classA
{

    void show2()
    {
        System.out.println(" I am reading");
    }
}
   class single  {
       public static void main(String[] args) {
           classA ob = new classA();
           ob.show1();
           B ob2 = new B();
           ob2.show2();           ob2.show1();
       }
   }

