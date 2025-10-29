package Exeception;

public class Demo2
{
    public static void main(String[] args)
    {
      int age = 10 ;
        Demo2 v = new Demo2();
      v.checkedAge(age);
    }
    void checkedAge(int age)
    {
        if (age >= 18 )
        {
           youCanVote();
        }
        else
        {
            //System.out.println("you cannot vote");
            throw new RuntimeException("You cannot vote");
        }

    }
    void youCanVote()
    {
        System.out.println("You Can Vote successfully");
    }
}
