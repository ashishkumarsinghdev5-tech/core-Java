package StringConsept;

public class StringConstructor
{
    public static void main(String[] args)
    {
        String str1 = new String("Ashish");
        System.out.println(str1);
        byte[] b= {97,98,99,65, };
        String str2 = new String(b);
        System.out.println(str2);
    }
}
