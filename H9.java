import java.util.Scanner;

public class H9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2,sum,product,distance,max,min,difference;
       // flout average;
        System.out.println("please enter the number1: ");
        number1=input.nextInt();
        System.out.println("please enter the number2: ");
        number2=input.nextInt();
        sum=number1+number2;
        System.out.println("sum= "+sum);
        difference=number1-number2;
        System.out.println("difference= "+difference);
        product=number1*number2;
        System.out.println("product=" +product);
        float average=((float) number1+number2)/2;
        System.out.println("average= "+average);
        distance=Math.abs((number1-number2));
        System.out.println("distance= "+distance);
        max=Math.max(number1,number2);
        System.out.println("the max number is: "+max);
        min=Math.min(number1,number2);
        System.out.println("the min number is: "+min);
    }
}
