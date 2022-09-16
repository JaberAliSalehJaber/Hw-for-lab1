import java.awt.*;
import javax.swing.JComponent;
public class Hw_4_8 extends JComponent  {
    // this object for write my name in rectangle.
    public  void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        //Rectangle n=new Rectangle();
        g2.setColor(Color.BLUE);
        g2.fillRect(50,50,120,100);
        g2.setColor(Color.RED);
        g2.drawString("Jaber Ali",80,100);
    }

}
