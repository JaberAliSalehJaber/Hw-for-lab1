public class H3_1 {
    public static void main(String[] args) {
        int n = 1;
        int m = -1;
        if (n < -m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
        if (-n >= m) {
            System.out.println(n);
        } else {
            System.out.println(m);
        }
        double x = 0, y = 1;
        if (Math.abs(x - y) < 1) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
        double x1=Math.sqrt(2),y1=2;
        if(x1*x1==y1)
        {
            System.out.println(x1);
        }
            else
            {
                System.out.println(y1);
        }
    }
}