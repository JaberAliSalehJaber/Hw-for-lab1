import java.util.Scanner;

public class Lap6_7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Please enter the number you want to convert to binary system :");
        int num= in.nextInt();
        for (int i = num; i >1; i--) {
            int binary;
           if(num%2==1)
               binary=1;
           else
               binary=0;

                num=num/2;

            System.out.println(binary);

        }
    }
}
