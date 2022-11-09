public class Lab6_6 {
    public static void main(String[] args) {
        int i=0;
        int sum=1;
        for (; i <=20; i++) {

            System.out.println("the power of "+ i +" = "+sum);
            sum=sum*2;
        }
        System.out.println("the sum of power from 2^0 to 2^20 is "+sum);
}
}
