import java.util.Scanner;

public class Question {
    private String text;
    private String answer;
    public Question(String questiontext){
        text=questiontext;
        answer=" ";
    }
    public  static void presentQuestion(Question q){
        q.display();
        System.out.println("Your answer :");
        Scanner in=new Scanner(System.in);
        String response =in.nextLine();
        System.out.println(q.checkAnswer(response));
    }

    public void setText(String questiontext) {
        text = questiontext;
    }

    public void setAnswer(String correctResponse) {
        answer = correctResponse;
    }
    public boolean checkAnswer(String response) {
        //return response.replaceAll("\\s","").toLowerCase().equals(answer.replaceAll("\\s","").toLowerCase());
    return response.equals(answer);
    }
    public void display(){
        System.out.println(text);
    }
}
