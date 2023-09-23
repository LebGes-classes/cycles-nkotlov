import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("a\t" + "b\t" + "c\tresult\n\n");
        for (int a = 0; a <= 1; ++a)
            for (int b = 0; b <= 1; ++b)
                for (int c = 0; c <= 1; ++c)
                    System.out.println(a + "\t" + b + "\t" + c + "\t" + ((a | b ^ c) | a) + "\n");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}