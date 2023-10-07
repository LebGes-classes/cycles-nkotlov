import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mas = new int[10];
        int i, a;

        System.out.println("введите массив");
        a = 0;
        for (i = 0; i < 10; i++) {
            mas[i] = scanner.nextInt();
            if ((i + 1) % 2 == 0 && mas[i] < 0) {
                a++;
            }9
        }
        System.out.println("ответ " + a);

        System.out.println("введите массив");
        for (i = 0; i < 10; i++) {
            mas[i] = scanner.nextInt();
        }
        i = 0;
        while (mas[i] != 0 && i < 10) {
            i++;
        }
        int k = 1;
        if (i < 10) {
            for (a = i; a < 10; a++) {
                k *= mas[a];
            }
            System.out.println(k);
        } else {
            System.out.println("нуля нет");
        }
    }
}
