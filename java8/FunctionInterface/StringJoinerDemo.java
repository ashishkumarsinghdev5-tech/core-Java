package FunctionInterface;
import java.util.StringJoiner;

public class StringJoinerDemo
{
    public static void main(String[] args)
    {
      StringJoiner sj = new StringJoiner(" - ");
      sj.add("Ashok kumar") ;
      sj.add("Pan singh");
      sj. add("mukesh singh");
        System.out.println(sj);
        StringJoiner sj2 = new StringJoiner ("-","(" ,")");



    }
}
