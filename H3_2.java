import java.util.Scanner;
public class H3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character[]=new char[]{'a', 'c', 'e', 'g', 'b', 'd', 'f', 'h'};
        System.out.println("please enter the letter");
        char letter = input.next().charAt(0);
        System.out.println("please enter the number");
        int number = input.nextInt();

        for (int i = 0; i < 8; i++)
            if (letter == character[i] && i < 4) {
                if (number % 2 == 1) {
                    System.out.println("Black");
                    break;
                } else {
                    System.out.println("White");
                    break;
                }
            }
    else
            {
                if (number % 2 == 1) {
                    System.out.println("White");
                    break;
                }

else{
            System.out.println("Black");
            break;
        }
    }
}
}
