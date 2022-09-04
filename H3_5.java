import java.util.Scanner;

public class H3_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("please enter the number1: ");
        number1= in.nextInt();
        System.out.println("please enter the number2: ");
        number2= in.nextInt();
        System.out.println("please enter the number3: ");
        number3= in.nextInt();
        System.out.println();
        if (number1==number2 && number1==number3)
        System.out.println("all the numbers are same ");
       else if (number1 != number2 && number1 != number3)
        System.out.println("all the numbers are different ");
        else
        System.out.println("neither");
    }
}
