
import java.util.Scanner;
public class Main {
    // Функции для заполнения массивов целочисленными и дробными значениями
    public static int[] genIntArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

    public static double[] genDoubleArray(int size, double min, double max) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random() * (max - min) + min;
        }
        return array;
    }

    // Функция для определения максимального значения и перегрузка для массива с дробными числами
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    public static double findMax(double[] array) {
        double max = array[0];
        for (double num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    // Функция для определения минимального значения и перегрузка для массива с дробными числами
    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public static double findMin(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    // Функция для определения среднего значения и перегрузка для массива с дробными числами
    public static double findAvg(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static double findAvg(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Функция для сортировки массива по возрастанию методом пузырька и перегрузка для массива с дробными числами
    public static void sortAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortAscending(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Функция для сортировки массива по убыванию методом пузырька и перегрузка для массива с дробными числами
    public static void sortDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDescending(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть больше 0");
            return;
        }

        System.out.print("Введите минимальное значение для генерации: ");
        int min = scanner.nextInt();
        System.out.print("Введите максимальное значение для генерации: ");
        int max = scanner.nextInt();

        // Заполнение и сортировка целочисленного массива
        int[] intArray = genIntArray(size, min, max);
        System.out.println("Сгенерированный массив с целыми числами: " + java.util.Arrays.toString(intArray));
        System.out.println("Максимальное значение: " + findMax(intArray));
        System.out.println("Минимальное значение: " + findMin(intArray));
        System.out.println("Среднее значение: " + findAvg(intArray));

        sortAscending(intArray);
        System.out.println("Массив по возрастанию: " + java.util.Arrays.toString(intArray));

        sortDescending(intArray);
        System.out.println("Массив по убыванию: " + java.util.Arrays.toString(intArray));

        // Заполнение и сортировка массива дробных чисел
        double[] doubleArray = genDoubleArray(size, min, max);
        System.out.println("Сгенерированный массив с дробными числами: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Максимальное значение: " + findMax(doubleArray));
        System.out.println("Минимальное значение: " + findMin(doubleArray));
        System.out.println("Среднее значение: " + findAvg(doubleArray));

        sortAscending(doubleArray);
        System.out.println("Массив по возрастанию: " + java.util.Arrays.toString(doubleArray));

        sortDescending(doubleArray);
        System.out.println("Массив по убыванию: " + java.util.Arrays.toString(doubleArray));

    }
}