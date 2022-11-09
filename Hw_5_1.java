public class Hw_5_1 {
    private int value;
public Hw_5_1()
    {value = 0;}
    public void click() {
        value = value + 1;
    }
    public int getValue() {
        return value;
    }
    public void resert() {value = 0;}
    public void undo() { value = value - 1; }
}