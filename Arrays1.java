import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
    public static void insert(Integer[] array2){
        System.out.println();
        System.out.println("Сортировка:");
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println(Arrays.toString(array2));
    }
    public static void zero(Integer[] array1) {
        int zeroIndex = -1;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == 0) {
                zeroIndex = i;
                break;
            }
        }
        if (zeroIndex == -1) {
            System.out.println("Нулевой элемент не найден");
        } else {
            System.out.println("Нулевой элемент найден в позиции: " + zeroIndex);
        }
    }

    public static void index(Integer[] array) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            } else if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Индекс максимального элементы массива: " + maxIndex);
        System.out.println("Индекс минимального элементы массива: " + minIndex);
    }

    public static void maxMin(Integer[] arrey) {
        int max = arrey[0];
        int min = arrey[0];
        for (int i = 1; i < arrey.length; i++) {
            if (arrey[i] > max) {
                max = arrey[i];
            }
            if (arrey[i] < min) {
                min = arrey[i];
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность первого массива: ");
        int a = sc.nextInt();
        System.out.print("Введите размерность второго массива: ");
        int b = sc.nextInt();
        Integer[] arr = new Integer[a];
        Integer[] arr1 = new Integer[b];
        for (int j = 0; j < arr1.length; j++) {
            System.out.print("Введите элемент массива: ");
            int c = sc.nextInt();
            arr1[j] = c;
        }
        System.out.println("Массив с ручным типом ввода:");
        System.out.println(Arrays.toString(arr1));
        index(arr1);
        zero(arr1);
        maxMin(arr1);
        insert(arr1);
        System.out.println("----------------------------------");
        for (int i = 0; i < arr.length; i++) {
            double d = Math.random() * 100;
            int resalt = (int) Math.round(d);
            arr[i] = resalt;
        }
        System.out.println("Массив со случайным типом ввода:");
        System.out.println(Arrays.toString(arr));
        index(arr);
        zero(arr);
        maxMin(arr);
        insert(arr);
    }
}
