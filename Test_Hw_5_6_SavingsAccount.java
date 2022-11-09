public class Test_Hw_5_6_SavingsAccount {
    public static void main(String[] args) {
        Hw_5_6_SavingsAccount account= new Hw_5_6_SavingsAccount(2000);
        account.deposit(1400);
        account.withdraw(400);
        /*The function works about this (balance+balance*0.1)
        Example:balance=2000; 2000+2000*0.1 so 2000+200=2200;*/
        account.addInterst();
        System.out.println(account.getBalance());
        System.out.println("---------------------");
        System.out.println("the expected result is : 3300");
    }
}
