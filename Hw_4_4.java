import java.awt.*;
public class Hw_4_4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5, 10,20,30);
        System.out.println("#you are now in method (AddTester).");

        box.add(0,0);
        System.out.println("the actual height is : "+box.height+" \nthe actual width is : "+box.width+"\nThe actual X is : "+box.x +" \nThe actual Y is : "+box.y);
        System.out.println("""
                the expected height is : 40\s
                the expected width is : 25
                The expected X is : 0
                The expected Y is : 0""");
    
    }
}
