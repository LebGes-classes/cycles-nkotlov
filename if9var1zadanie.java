import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число k: ");
        int k = scanner.nextInt();

        System.out.print("Введите действительное число a: ");
        double a = scanner.nextDouble();

        double X = Math.pow(a, 2) + Math.abs(k) / (Math.sqrt(12.7 + Math.sin(Math.pow(a,2))));
        double Y = (Math.exp(-1/a)) + Math.tan(Math.pow(k,2));
        double Z = 1 / 7 + Math.sqrt(a/(Math.pow(k,2))) + Math.log(a/3);

        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
        System.out.println("Z = " + Z);
    }
}
