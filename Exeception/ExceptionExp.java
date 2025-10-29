package Exeception;

import java.util.Scanner;

public class ExceptionExp
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age =s.nextInt();
        if (age<18)
        {
            throw new InvalidAgeException("You cannot vote, age is invalid");
        }
        System.out.println("you can vote now ......................!!");
    }
}
