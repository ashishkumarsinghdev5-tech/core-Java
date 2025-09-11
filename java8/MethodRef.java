@FunctionalInterface   // static method ref.
    interface MyInterface
    {
        public void m1();
    }


public class MethodRef
{
    public static void m2()
    {
        System.out.println("this is m2 () method");
    }
    public static void main(String[] args)
    {
          // MyInterface mi = MethodRef::m2;  (static method ref)
        MyInterface mi = () -> System.out.println("hii");
           mi .m1();
    }
}
