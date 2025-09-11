package Encapsulation;

public class AccountMain {
    public static void main(String[] args) {
        // Creating account object
        Account ob1 = new Account();
        ob1.setAccno("1111111");
        ob1.setAmount(1000000);

        // Bank operations
        BankFunction bf = new BankFunction();
        bf.deposit(ob1, 50000);
        bf.withdraw(ob1, 3000);

        // Final account details
        System.out.println("Full Details: " + ob1.getAccno() + " : " + ob1.getAmount());
    }
}
