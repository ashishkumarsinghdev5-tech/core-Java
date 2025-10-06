package InterviewQuestionJava;

public class PalindromeCheck
{
    public static void main(String[] args)
    {
        String str = "madam";
        String reverseStr = "";
        for (int i = str.length() -1 ;i >=0 ; i--)
        {
            reverseStr += str.charAt(i);

        }
        if (str.equals(reverseStr))
        {
            System.out.println(str + "is a palindrome");
        }
        else
        {
            System.out.println(str + "is not a palindrome");
        }
    }
}
