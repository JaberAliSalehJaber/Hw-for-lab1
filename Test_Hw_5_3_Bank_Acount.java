public class Test_Hw_5_3_Bank_Acount {
    public static void main(String[] args) {
        Hw_5_3_Bank_Acount account=new Hw_5_3_Bank_Acount();
        account.deposit(1000);
        System.out.println(account.getBalance());
        account.withdraw(500);
        account.withdraw(400);
        System.out.println(account.getBalance());
        System.out.println("---------------------------------------");
        System.out.println("the expected result is : 100");
    }
}
