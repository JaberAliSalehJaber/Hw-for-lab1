public class Hw_5_6_SavingsAccount {
    private double balance;
    public Hw_5_6_SavingsAccount()
    {balance=0;}
    public Hw_5_6_SavingsAccount(double initBalance)
    {balance=initBalance;}
    public void addInterst(){

        balance=balance+balance*0.1;
    }
    public void deposit(double amount){

        balance=(balance+amount);
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}


}
