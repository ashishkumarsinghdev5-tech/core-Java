package StringConsept;

public class CheckPalindrome
{
    public static void main(String[] args)
    {
        String str="ala" ;
        int length = str.length();
        String rev = "";
        for(int i=length-1;i>=0;i--)
        {
            // System.out.println(name.charAt(i));
            rev= rev + str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
