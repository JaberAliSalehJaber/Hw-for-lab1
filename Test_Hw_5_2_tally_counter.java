public class Test_Hw_5_2_tally_counter {
    public static void main(String[] args) {
        Hw_5_2_tally_count n = new Hw_5_2_tally_count();
        n.setlimit(2);
        n.click();
        n.click();
        n.click();
        n.click();
        System.out.println(n.getcounter());
    }
}
