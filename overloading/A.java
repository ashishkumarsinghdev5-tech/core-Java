public class A
{
    A()
    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A a1 = new A();
        A.test1();
        a1.test2();
    }
public static void test1()
        {
            System.out.println("test 1");
        }
        public static void test2 ()
        {
            System.out.println("test 2");  
        }

    }

