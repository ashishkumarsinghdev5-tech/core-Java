import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.function.BiFunction;

public class MethodRef2
{
    public static int add (int a,int b)
    {
        return a+b ;

    }

    public static void main(String[] args)
    {
        BiFunction<Integer,Integer,Integer> lambdaAdd = (a,b) -> MethodRef2.add(a,b);
        BiFunction<Integer,Integer,Integer> refAdd = MethodRef2::add;
        System.out.println("Lambda Add "+ lambdaAdd.apply(0,20));
        System.out.println("Method Ref Add : " + refAdd.apply(2000,3000));
    }
}
