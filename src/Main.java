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
}