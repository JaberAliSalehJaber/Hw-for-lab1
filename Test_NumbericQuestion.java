import java.util.Scanner;

public class Test_NumbericQuestion {
    public static void main(String[] args) {

        Question q1= new Question();
        q1.setText("Who was the inventor of Java? ");
        q1.setAnswer("James Gosling");

        Question q2= new Question();
        q2.setText("pi? ");
        q2.setAnswer("3.141592");


        presentQuestion(q1);
        presentQuestion(q2);
    }
    public static void presentQuestion(Question q)
    {
        q.display();
        System.out.println("Your answer :");
        Scanner in=new Scanner(System.in);
        String r=in.next();
        System.out.println(q.checkAnswer(r));

    }
}
