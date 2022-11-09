import java.util.ArrayList;
public class Fill_In_Question extends Question {
    public Fill_In_Question(String questiontext){
        super(questiontext);
        String temp1=questiontext.replaceAll("_\\w+","__");
        String temp2=temp1.replaceAll("\\w+_","__");
        String temp3=temp2.replaceAll("__ __","____");
        String tempSplit[] =questiontext.split("_");
    }
    public void setAswer(String correctchoice){
        super.setAnswer(correctchoice);
    }

    @Override
    public boolean checkAnswer(String response) {
        return super.checkAnswer(response);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
