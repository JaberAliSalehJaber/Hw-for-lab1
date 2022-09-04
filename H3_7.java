import java.util.Scanner;

public class H3_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("please enter the number1: ");
        number1= in.nextInt();
        System.out.println("please enter the number2: ");
        number2= in.nextInt();
        System.out.println("please enter the number3: ");
        number3= in.nextInt();
        System.out.println(number1+" , "+number2+" , "+number3);
        if (number1>number2&&number2>number3)
            System.out.println("in order");
        else if (number3>number2&&number2>number1)
            System.out.println("in order");
        else
            System.out.println("not in order");
    }
}
