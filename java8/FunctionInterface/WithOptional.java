package FunctionInterface;

import java.util.Optional;

public class WithOptional
{
    public static void main(String[] args)
    {
        Optional<String> nameOpt = getUserNameByld(200);
        // instead of null check -> use optional method
        String msg = nameOpt.map(String::toUpperCase).map(n ->n+ ",Hello").orElse("invalid id ");
        System.out.println(msg);
    }
    static Optional<String>getUserNameByld(int id)
    {
        if(id == 100) return Optional.of("Rahul");
       else if(id == 101) return Optional.of("akash");
       else if(id == 102) return Optional.of("kamlesh");
       return Optional.empty(); // suffer then returning null
    }
}
