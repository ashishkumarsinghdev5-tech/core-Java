public class classA//constructor overloading
{
    classA()
    { // no of arguments
        System.out.println("class a");
    }
    classA(int x)
    {// no of arguments
        System.out.println(x);
    }
    classA(int x,int y)
    { //  no of argument
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        classA a1 = new classA();
        classA a2 = new classA(200);



        classA a3 = new classA(200,300);
        classA a4 = new classA(5000);
        classA a5 = new classA();

    }
}
