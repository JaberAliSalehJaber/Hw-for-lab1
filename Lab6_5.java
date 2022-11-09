import java.util.Scanner;

public class Lab6_5 {
    public static void main(String[] args) {
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the words you want to now the vowels inside it : ");
        String word;
        word=in.next();
        for (int i = 0; i <word.length() ; i++) {
            char l=word.charAt(i);
            if (l=='a'||l=='e'||l=='o'||l=='u'||l=='i'){
                count++;
                System.out.println("the letter of vowels is : "+l);
            }

        }
        System.out.println("the number of vowels is : "+count);

    }
}
