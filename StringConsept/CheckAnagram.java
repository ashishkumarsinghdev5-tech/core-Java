package StringConsept;

import java.util.Arrays;

public class CheckAnagram
{
    public static void main(String[] args)
    {
       String str1 ="Car";
       String str2 ="Arc";
       char[] ch1 = str1.toLowerCase().toCharArray();
       char[] ch2 = str2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("two String are anagram");
        }
        else
        {
            System.out.println("two string are not anagram");
        }
    }
}
