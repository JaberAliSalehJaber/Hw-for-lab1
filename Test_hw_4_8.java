import javax.swing.JFrame;
public class Test_hw_4_8 {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hw_4_8 Draw=new Hw_4_8();
        f.setVisible(true);
        f.add(Draw);
    }
}
