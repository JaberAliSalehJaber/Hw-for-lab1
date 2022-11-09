public class NumbericQuestion extends Question{
    private double answer;
    public void setAnswer(double correctResponse){
        answer=correctResponse;
    }

    @Override
    public boolean checkAnswer(String response) {
        double responseDouble=Double.parseDouble(response);
        return Math.abs(responseDouble-answer)<=0.01;
    }
}
