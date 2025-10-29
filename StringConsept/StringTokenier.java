package StringConsept;

import java.util.StringTokenizer;

public class StringTokenier
{
    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer("this is my friend");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
            
    }
}
