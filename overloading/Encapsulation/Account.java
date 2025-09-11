package Encapsulation;

public class Account
{
    private int amount;
    private String accno;
    public void setAmount(int amount )
    {
        this.amount = amount;
    }
    public void getAmount()
    {
        return amount;
    }
    public void setAccno(String accno)
    {
        this.accno=accno;
    }
    public String getAccno()
    {
        return accno;
    }


}
