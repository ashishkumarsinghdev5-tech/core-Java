package StringConsept;

public class CheckPalindrome2 {
    public static void main(String[] args) {
        String str = "This is  demo";
        int count = 0;
        boolean b = true;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ' ')
            {
              b= true ;
            }
            else if (b == true)
            {
                b = false;
                count++;
            }
        }
        System.out.println(count);
    }
}

