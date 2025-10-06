package InterviewQuestionJava;

public class LargestOfThree
{
    public static void main(String[] args)
    {
      int a=10 ,b=20 ,c=15;
      int largest = (a>b) ? (a>c ? a:b ):(b>c ? b:c);
        System.out.println("The Largest Number is:" + largest);

    }
}
