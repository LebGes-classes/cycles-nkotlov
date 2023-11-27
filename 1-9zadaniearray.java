import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 8, -7, 9, 0, -5, -2, 7, 0};

        int a = b(array);
        System.out.println("Количество отрицательных элементов массива с четными номерами: " + a);

        int z = x(array);
        System.out.println("Сумма элементов массива, расположенных до последнего нулевого элемента: " + z);

        System.out.println("Массив: " + Arrays.toString(array));
    }

    public static int b(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public static int x(int[] array) {
        int sum = 0;
        int zerolast = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zerolast = i;
            }
        }

        if (zerolast!= -1) {
            for (int i = 0; i < zerolast; i++) {
                sum += array[i];
            }
        }

        return sum;
    }
}
