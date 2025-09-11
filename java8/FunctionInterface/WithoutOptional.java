package FunctionInterface;

public class WithoutOptional
{
    public static void main(String[] args)
    {
      String name = getUserNameByld(200);  // return null
        if (name!= null)
        {
            System.out.println(name.toUpperCase());
        }
        else
        {
            System.out.println("Invalid id ");
        }
    }
    static String getUserNameByld(int id)
    {
        if (id == 100 ) return  "rahul";
        else if (id == 101) return "Lako";
        else if (id == 103) return "Lako kumar";
        else if (id == 104) return "pammi";
        return  null; // risky

    }
}
