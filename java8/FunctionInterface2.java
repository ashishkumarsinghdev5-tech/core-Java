import java.util.function.Consumer;

public class FunctionInterface2
    // which lambda function called
    // case 1:  no output
    // case 2 : no input
    // then use Consumer
{
    public static void main(String[] args)
    {
        Consumer<String> consumer =(msg)-> System.out.println( msg);
        consumer.accept("hii");
        consumer.accept("hello");


    }
}
