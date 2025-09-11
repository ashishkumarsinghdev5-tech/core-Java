public class Animal16
{
    int age = 10;
    String colour ;
    Animal16(int age , String colour )
    {
        age = age ;
        colour=colour;
    }

    void eat()
    {
        System.out.println("i am eating");
    }
    void run ()
    {
        System.out.println("i am running");
    }

    public static void main(String[] args)
    {
        Animal16 buzo = new Animal16(10 ,"brown" );
        System.out.println("age : " +buzo.age);
        System.out.println("colour:" +buzo.colour);
        buzo.run();
        buzo.eat();

        System.out.println("..............................");


        Animal14 cat = new Animal14();
        cat .age =5;
        cat.colour="black";
        System.out.println("age :"+cat.age);
        System.out.println("colour:"+cat.colour);
        cat.eat();
        cat.run();
    }
}

