import java.util.Scanner;

public class H3_4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        for(;;) {
            System.out.println("if you want to exit for this program enter (01)");
            int num;
            System.out.println("Enter the number:");
            num= in.nextInt();
            if(num<0)
                num=num*-1;
            else
                num=num;
            if (num == 01)
                break;
            if (num < 10) System.out.println("the length of the number is: " + 1);
            else if (num < 100) System.out.println("the length of the number is: " + 2);
            else if (num < 1000) System.out.println("the length of the number is: " + 3);
            else if (num < 10000) System.out.println("the length of the number is: " + 4);
            else if (num < 100000) System.out.println("the length of the number is: " + 5);
            else if (num < 1000000) System.out.println("the length of the number is: " + 6);
            else if (num < 10000000) System.out.println("the length of the number is: " + 7);
            else if (num < 100000000) System.out.println("the length of the number is: " + 8);
            else System.out.println("the length of this number is normal");
        }

    }

}
