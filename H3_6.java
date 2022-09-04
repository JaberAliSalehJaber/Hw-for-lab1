import java.util.Scanner;

public class H3_6 { public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int number1,number2,number3;
    System.out.println("please enter the number1: ");
    number1= in.nextInt();
    System.out.println("please enter the number2: ");
    number2= in.nextInt();
    System.out.println("please enter the number3: ");
    number3= in.nextInt();
    System.out.println(number1+" , "+number2+" , "+number3);
    if (number2==number1+1 && number3==number2+1)
        System.out.println("Increasing ");
    else if (number1==(number2+1) && number1==(number3+2))
        System.out.println("decreasing ");
    else
        System.out.println("neither");
}
}
