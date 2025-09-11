package Encapsulation;

public class BankFunction
{
    // Deposit method
        public void deposit(Account acc, int dptamt) {
            int total = acc.getAmount() + dptamt;
            acc.setAmount(total);
            System.out.println("Deposited: " + dptamt);
        }

        // Withdraw method
        public void withdraw(Account acc, int wthamt) {
            int current = acc.getAmount();
            if (wthamt <= current) {
                acc.setAmount(current - wthamt);
                System.out.println("Withdrawn: " + wthamt);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        }
    }
