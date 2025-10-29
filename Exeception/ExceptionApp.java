package Exeception;

import java.util.Scanner;

public class ExceptionApp
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = s.next();

        System.out.println("Enter your 10-digit account number :");
        String account = s.next();

        if (account.length() != 10)
        {
            throw new BankExe("Your account number is invalid!");
        }

        System.out.println("Enter amount to withdraw :");
        int amount = s.nextInt();

        int balance = 50000;

        if (amount > balance)
        {
            throw new BalanceExe("Insufficient balance! Your current balance is: " + balance);
        }

        System.out.println("Transaction Successful! You withdrew " + amount );
        System.out.println("Thank you, " + name + "! Your remaining balance is: " + (balance - amount)  );
    }
}
