//import javax.swing.*;
import java.awt.*;
import javax.swing.JComponent;
public class Hw_4_9 extends JComponent {
    public void paintComponent(Graphics b){
        Graphics2D b2=(Graphics2D) b;
       // Rectangle r=new Rectangle();
        b2.setColor(Color.BLACK);
        b2.fillRect(100,100,150,350);

        b2.setColor(Color.RED);
        b2.fillOval(150,120,75,75);
        b2.setColor(Color.YELLOW);
        b2.fillOval(150,230,75,75);
        b2.setColor(Color.GREEN);
        b2.fillOval(150,340,75,75);

    }
}
