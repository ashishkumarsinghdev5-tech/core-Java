import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;



public class PredicateDemo2

{
    public static void main(String[] args)
    {
        Predicate<Integer> p = (i) -> i > 10 ;
        System.out.println(p.test(5));
        System.out.println(p.test(15));
        System.out.println("=======================");
        BiPredicate<Integer ,Integer> bip = (i,j)->(i+j) >=20;
        System.out.println(bip.test(2000,200));
        System.out.println(bip.test(23,455));
    }
}
