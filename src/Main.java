
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double expensesAverage = 0;
        for (int element : arr) {
            expensesAverage = expensesAverage + element;
        }
        expensesAverage = expensesAverage / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + expensesAverage + " рублей");
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] array = generateRandomArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int salaryTotal = 0;
        for (int element : arr) {
            salaryTotal = salaryTotal + element;
        }
        System.out.println("Сумма трат за месяц составила " + salaryTotal + " рублей");
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}
