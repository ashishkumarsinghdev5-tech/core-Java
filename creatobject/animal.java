public class animal
{
    String colour ;
    int age ;
    void initObj(String C,int a)
{
    colour = C ;
    age = a ;
}
void display ()
{
    System.out.println( "Colour" + " "  + "age");
}

    public static void main(String[] args)
    {
        animal buzo = new animal();
        buzo.initObj("black" ,10);
        buzo.display();
    }

}
