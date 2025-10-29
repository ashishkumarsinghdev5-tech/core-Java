package StringConsept;

public class StringMethod3

{
    public static void main(String[] args)
    {
       String str1 = new String("Ashish");
       String str2 = new String("Ashish");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String name1 = new String("kamlesh");
        String name2 = new String("kamlesh");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
    }
}
