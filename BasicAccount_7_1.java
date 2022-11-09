public class BasicAccount_7_1 {
    private double balance;
    public BasicAccount_7_1()
    {balance=0;}
    public BasicAccount_7_1(double initBalance)
    {balance=initBalance;}
    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount) {
    if (balance>amount)
        balance=balance-amount;
        System.out.println("sorry you can not to do this process");
    }
    public double getBalance(){return balance;}

}
