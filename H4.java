import java.util.Scanner;

public class H4 {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        float count,avg;
        float num1,num2,num3;
        System.out.println(" please enter the number1:");
        num1=in.nextFloat();
        System.out.println(" please enter the number2:");
        num2=in.nextFloat();
        System.out.println(" please enter the number3:");
        num3=in.nextFloat();
count=(num1+num2+num3);
avg=count/3;
        System.out.println("count = "+count +"\navg="+avg);
    }
}



