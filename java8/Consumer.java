import java.util.function.Function;

public class Consumer
{
    public static void main(String[] args)
            // function interface (1.4 - function example )
    {
        Function<String,Integer> f = (name) ->name.length();
        System.out.println(f.apply("Ashish"));
        System.out.println(f.apply("Mummy"));
        System.out.println(f.apply("Pappu"));


    }
}
