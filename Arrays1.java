import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Arrays1 {
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
        int index = Arrays.binarySearch(arrey, min);
        int index1 = Arrays.binarySearch(arrey, max);
        System.out.println("Индекс минимального элементы массива: " + index);
        System.out.println("Индекс максимального элементы массива: " + index1);
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
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr1));
        maxMin(arr1);
        System.out.println("----------------------------");
        for (int i = 0; i < arr.length; i++) {
            double d = Math.random() * 100;
            int resalt = (int) Math.round(d);
            arr[i] = resalt;
        }
        System.out.println("Массив со случайным типом ввода:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        maxMin(arr);
    }

}
