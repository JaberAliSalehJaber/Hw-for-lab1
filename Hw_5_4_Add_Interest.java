public class Hw_5_4_Add_Interest { private double balance;
    public Hw_5_4_Add_Interest()
    {balance=0;}
    public Hw_5_4_Add_Interest(double initBalance)
    {balance=initBalance;}
    public void addInterst(double add){

        balance=balance+balance/add;
    }
    public void deposit(double amount){

        balance=(balance+amount);
    }
    public void withdraw(double amount) {

        balance=balance-amount;
    }
    public double getBalance(){return balance;}

}
