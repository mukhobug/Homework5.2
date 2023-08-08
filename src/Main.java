import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n\n Первое задание:");
        task1();
        System.out.println("\n\n\n Второе задание:");
        task2();
        System.out.println("\n\n\n Третье задание:");
        task3();
        System.out.println("\n\n\n Четвёртое задание:");
        task4();
        System.out.println("\n\n\n Пятое задание:");
        task5();
        System.out.println("\n\n\n Шестое задание:");
        task6();
        System.out.println("\n\n\n Седьмое задание:");
        task7();
        System.out.println("\n\n\n Восьмое задание:");
        task8();
        System.out.println("\n\n\n Девятое задание:");
        task9();
    }

    public static int[] genRandArr() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = genRandArr();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sum);
    }

    public static void task2() {
        int[] arr = genRandArr();
        int min = 200000, max = -1;
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей", min, max);
    }

    public static void task3() {
        int[] arr = genRandArr();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double mid = sum * 1.0f / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", mid);
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static void task5() {
        int[][] matrix = new int[10][14];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], 1);
            for (int j = 0; j < matrix[i].length; j++) {
                if (i + j != matrix.length - 1 && (j - i < 0 || i - j < 0)) {
                    matrix[i][j] = 0;
                }
            }
        }
//        int i = 0, j = 0;
//        for (int k = 0; k < matrix.length * matrix[0].length; k++) {
//            if (i == j || j == matrix.length - 1 - i) {
//                matrix[i][j] = 1;
//            }
//            if (j >= matrix[i].length - 1) {
//                j = 0;
//                i++;
//            } else {
//                j++;
//            }
//        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task6() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] car = new int[5];
        for (int i = arr.length - 1; i >= 0; i--) {
            car[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(car));
    }

    public static void task7() {
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length / 2; i++) {
            int p = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = p;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
//        int da = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i + j == -2) {
//                    da++;
                    System.out.printf("\n%d,%d", i, j);
                    return;
                }
            }
        }
    }

    public static void task9() {
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.printf("\n%d,%d", arr[i], arr[j]);
                }
            }
        }
    }
}