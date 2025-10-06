package InterviewQuestionJava;

public class CountVowels
    // count vowel and Consonants
    // How do you count the number of vowels and consonants  in a string
{
    public static void main(String[] args)
    {
      String str = "java programming " ;
      int vowels = 0 , consonants = 0 ;
      str = str.toLowerCase();
      for (int i = 0 ; i < str.length();i++)
      {
          char ch = str.charAt(i);
          if (ch == 'a'|| ch == 'e'|| ch == 'i'|| ch =='o'||ch == 'u')
          {
              vowels++;
          }
          else if (ch >= 'a' && ch <= 'z')
          {
              consonants ++ ;
          }
          System.out.println("number of vowels" + vowels);
          System.out.println("number of consonants" + consonants);

      }
    }
}
