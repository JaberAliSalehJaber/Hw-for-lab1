public class Test_BasicAccount_7_1 {
    public static void main(String[] args) {
        BasicAccount_7_1 account=new BasicAccount_7_1(300);
        System.out.println(account.getBalance());
        account.deposit(100);
        account.withdraw(600);
        account.withdraw(50);
        System.out.println(account.getBalance());

    }
}
