import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldStr = scanner.nextLine();
        String newStr = "";
        for (int i = oldStr.length() - 1; i >= 0; i--)
            newStr += oldStr.charAt(i);
        System.out.println(newStr);
    }
}