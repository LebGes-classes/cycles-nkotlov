import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x: ");
        double x = scanner.nextDouble();

        System.out.print("Введите координату y: ");
        double y = scanner.nextDouble();

        boolean a = false;

        if ((x >= -2 && x <= 0 && y >= -2 && y <= 2) || ((x >= 1 && x <= 2 && y >= -2 && y <= 2) || (x >= 0 && x <= 2 && (y <= 2 && y >= 1 || y >= -2 && y <= -1)))) {
            {
                a = true;
            }
        }

        System.out.println(a ? "TRUE" : "FALSE");
    }
}
