import java.util.Scanner;

public class H3_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number:");
        int number = in.nextInt();

      if (number>0)
            System.out.println("positive");
        else if(number<0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }
}
