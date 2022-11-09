import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Question q1= new Question();
        q1.setText("Whats your name ");
        q1.setAnswer("Ali");

        ChoeseQuestion q2= new ChoeseQuestion();
        q2.setText("Who are you ");
        q2.addchoices("Ahmed",false);
        q2.addchoices("Ali",true);
        q2.addchoices("Hani",false);

    presentQuestion(q1);
    presentQuestion(q2);
    }
    public static void presentQuestion(Question q)
    {
        q.disply();
        Scanner in=new Scanner(System.in);
        String r=in.next();
        System.out.println(q.checkAnswer(r));

    }
}
