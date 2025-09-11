import java.util.function.Supplier;
public class PredicateDemo1
{
    public static void main(String[] args)
    {
        // Supplier Function Interface(2.2 Supplier)
        String symblos = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // i want the lambda exprassion

        Supplier<String> s = () ->
        {
            String otp =" ";
            for (int i =1 ; i <6; i++)
            {
                otp = otp + (int) (Math.random()*10 ) ;
            }return otp ;
        };
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
