package FailFastDemo;

import java.util.StringTokenizer;
// StringTokenizer example (util.package)

public class Demo13
{
    public static void main(String[] args)
    {
        String s = "The java program by Ashish";
        StringTokenizer st= new StringTokenizer( s," ");
        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
