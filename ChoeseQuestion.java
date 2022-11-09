import java.util.ArrayList;

public class ChoeseQuestion extends Question {
    private ArrayList<String>choices;
    public ChoeseQuestion(){
        choices=new ArrayList<>();
    }
    public void addchoices(String ch,boolean correct){
        choices.add(ch);
        if (correct)
            setAnswer(choices.size()+"");
    }
    public void disply(){
        super.disply();
        for (int i = 0; i < choices.size(); i++) {
            System.out.println(i+1+"-"+choices.get(i));

        }

    }
}
