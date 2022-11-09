public class Test_Hw_5_4_Add_Interest {
    public static void main(String[] args) {
        Hw_5_4_Add_Interest acount = new Hw_5_4_Add_Interest(1000);
        acount.deposit(1400);
        acount.withdraw(400);
        /*The function works about this (balance+balance/add)
        Example:balance=1000;add=10; 1000+1000/10 so 1000+100=1100;*/
        acount.addInterst(10);
        System.out.println(acount.getBalance());
        System.out.println("---------------------");
        System.out.println("the expected result is : 2200");
    }
}
