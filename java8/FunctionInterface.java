import java.util.function.BiFunction;

public class FunctionInterface
{
    public static void main(String[] args)
            // take 2 input and perform sum of two input and return output
            // how to write the lambda expression
    {
        BiFunction<Integer,Integer,Integer>bif = (a,b) ->(a+b);
        System.out.println(bif.apply(10,20));
        System.out.println(bif.apply(100,203333));
        System.out.println(bif.apply(100,200));
        
    }
}
