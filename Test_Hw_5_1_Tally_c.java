public class Test_Hw_5_1_Tally_c {
    public static void main(String[] args) {
        Hw_5_1 c=new Hw_5_1();
        System.out.println(c.getValue());
        c.click();
        c.click();
        c.click();
        System.out.println(c.getValue());
        c.undo();
        c.undo();
        System.out.println(c.getValue());
       // System.out.println(c.getValue());
        c.resert();
        System.out.println(c.getValue());

    }
}
