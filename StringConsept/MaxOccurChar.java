package StringConsept;

public class MaxOccurChar
{
    public static void main(String[] args)
    {
        String str = "this is Demo ";
        str = str .replaceAll("\\s","");
        System.out.println(str);
        int [] arr = new int[126];
        for (int i=0 ;i<str.length();i++)
        {
            arr [str.charAt(i)]= arr [str.charAt(i) +1];
        }
        int min = -1 ;
        char c= ' ';
        for(int i=0 ;i<str.length();i++)
        {
            if(min<arr[str.charAt(i)])
            {
                min=arr[str.charAt(i)];
                c= str.charAt(i);
            }
        }
    }
}
