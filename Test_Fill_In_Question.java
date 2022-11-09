import java.util.Scanner;

public class Test_Fill_In_Question {
    public static void main(String[] args) {
        Question[] ques= new Question[2];
        Fill_In_Question question0 =new Fill_In_Question("_James Gosling_ was the inventor of Java. ");
        ques[0]=question0;
        question0.display();
        System.out.println("your answer: ");
        Scanner in=new Scanner(System.in);
        String response= in.nextLine();
        System.out.println(question0.checkAnswer(response));
    }
}
