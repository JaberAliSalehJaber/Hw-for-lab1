public class Hw_5_3_Bank_Acount {
    private double balance;
public Hw_5_3_Bank_Acount()
    {balance=0;}
    public Hw_5_3_Bank_Acount(double initBalance)
    {balance=initBalance;}
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}

}
