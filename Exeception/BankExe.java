package Exeception;

public class BankExe extends CustomerExe {

    public BankExe() {
        super("Please input the correct account number");
    }

    public BankExe(String msg) {
        super(msg);
    }
}
