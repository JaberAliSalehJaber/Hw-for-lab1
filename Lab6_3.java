import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the word : ");
        String word;
        word=in.next();
        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));

        }
    }
}
