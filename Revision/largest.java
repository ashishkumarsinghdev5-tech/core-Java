public class largest
{
    public static void main(String[] args)
    {
        int a=100 ,b=203,c=303;
        if (a > b)
        {
            if (a > c)
            {
                System.out.println("a is greater");
            } else
            {
                System.out.println("c is greater");
            }
        }
        else if(b>c)
        {
            System.out.println("b is greater");
        }

    }
}
