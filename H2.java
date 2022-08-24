import java.util.Scanner;

public class H2 {
        public static void main(String[] args) {
            Scanner in =new Scanner(System.in);
            float area_cer ,perimeter_cer;
            final float a=3.1459f;
            int r;
            System.out.println(" please enter r:");
            r=in.nextInt();
            area_cer= a*(r*r);
            perimeter_cer = 2 * (a * r) ;
            System.out.println("area= "+area_cer+"\ncircle="+perimeter_cer);
        }
    }



