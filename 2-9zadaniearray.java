public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 3}
        };

        // Вывод исходной матрицы
        System.out.println("Исходная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int maxElement = matrix[0][0];
        int maxElementIndex = 0;

        // Поиск максимального элемента на главной диагонали
        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][i] > maxElement) {
                maxElement = matrix[i][i];
                maxElementIndex = i;
            }
        }

        System.out.println("Максимальный элемент на главной диагонали: " + maxElement);

        // Поменять местами 1 и 2 строки матрицы
        int[] t = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = t;

        // Вывод полученной матрицы
        System.out.println("Полученная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
