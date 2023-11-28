import java.lang.Math;

public class Main {
    public static void main (String [] args) {
        int x = -6;
        double y = 0;
        System.out.print("x = ");
        while (x <= 3) {
            System.out.print("\t" + x);
            x++;
        }
        x = -6;
        System.out.print("\n" + "y = ");
        while (x <= 3) {
            if (x >= -6 && x <= -2) {
                y = fLine(x,-6,-2,-1,0);
            }
            if (x > -2 && x <= 0) {
                y = fCircle(x,-2,2,2);
            }
            if (x > 0 && x <= 2) {
                y = fCircle(x,0,0,2);
            }
            if (x > 2 && x <= 3) {
                y = fLine(x,2,3,0, -1);
            }
            x++;
            System.out.print("\t" + y);
        }
    }
    public static double fCircle (int x, int x0, int y0, int R) {
        double y = Math.sqrt(R * R - Math.pow((x - x0), 2)) + y0;
        return y;
    }
    public static double fLine (int x, int x1, int x2, int y1, int y2) {
        double y = (double) (y2 - y1) / (x2-x1) * (x - x1) + y1;
        return y;
    }
}
