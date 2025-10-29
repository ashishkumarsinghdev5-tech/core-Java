package StringConsept;
// Remove all duplicate  string

import java.util.Arrays;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {

      String str = "ashish kumar singh";
      char[] ch = str.toCharArray();
      int count = 0;
      for (int i=0 ;i<str.length();i++)
      {
          int j;
          for ( j=0 ;j<i ; j++)
          {
              if (ch [i] == ch [j])
              {
                  break;
              }
          }
          if (i==j)
          {
           ch[count]= ch[i];
           count++;
          }

       }
//      while (count<str.length())
//    {
//        ch[count]= ' ';
//        count++;
//    }
    String newstr = String.copyValueOf(Arrays.copyOf(ch,count));
        System.out.println(new String(newstr)); // its predefine method
    }
}
