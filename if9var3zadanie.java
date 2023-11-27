import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим число n
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        // Вычисляем сумму квадрата числа и квадратов цифр
        int squareSum = n * n; // квадрат числа

        int digitSum = 0; // сумма квадратов цифр
        int t = n;
        while (t != 0) {
            int digit = t % 10;
            digitSum += digit * digit;
            t /= 10;
        }

        int result = squareSum + digitSum; // итоговая сумма

        // Выводим результат
        System.out.println("Сумма квадрата числа и квадратов цифр: " + result);
    }
}
