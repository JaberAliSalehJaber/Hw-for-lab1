public class Lap6_2 {
    private  int num1;
    private  int num2;
    private int sumEven=0,sumOod=0;
    public Lap6_2(){}
    public Lap6_2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public int getSumEven(){
        for (int i = num1; i <=num2 ;i++ ) {
            if (i%2==0){
                // sumEven=0;
                sumEven+=i;
            };
                }
        return sumEven;
    }
    public int getSumOod(){
        for (int i = num1; i <=num2 ;i++ ) {
            if (i%2==1){
                sumOod+=i;
            };
        }
        return sumOod;
    }
}
