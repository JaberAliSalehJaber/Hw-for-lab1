import java.util.Scanner;

public class H3 {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
    double area_rectangle ,perimeter_rectangle;
    float widgh,high;
    System.out.println(" please enter widgh:");
    widgh=in.nextFloat();
    System.out.println(" please enter high:");
    high=in.nextFloat();
    area_rectangle= high * widgh;
    perimeter_rectangle = 2 * (high * widgh) ;
    System.out.println("area = "+ area_rectangle +"\ncircle="+perimeter_rectangle);
}
}

