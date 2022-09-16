import java.util.Random;

public class Hw_4_6 {
    public static void main(String[] args) {
        Random random_number=new Random();
      //  repeated printing tO test (the Random) if it gives random values
        System.out.println(random_number.nextInt(6));
        System.out.println(random_number.nextInt(6));
        System.out.println(random_number.nextInt(6));
        System.out.println(random_number.nextInt(6));
    }
}
