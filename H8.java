import java.util.Scanner;

public class H8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double number,square,cube,fourth_power;
        System.out.println("please enter the number:");
        number=input.nextInt();
        square=(number*number);
        System.out.println("square= "+square);
        cube=(number*number*number);
        System.out.println("cube= "+cube);
        fourth_power=Math.pow(number,4);
        System.out.println("the fourth power for number is= "+fourth_power);

    }
}
