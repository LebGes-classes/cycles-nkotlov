public class Main {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            if (((i / 10) * (i / 10) + (i % 10) * (i % 10)) % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}