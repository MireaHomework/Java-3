package pw3.task3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    /*
    4. Пользователь должен ввести с клавиатуры размер массива -
    натуральное число больше, так чтобы введенное пользователем число
    сохранялось в переменную n. Если пользователь ввел не подходящее число, то
    программа должна просить пользователя повторить ввод. Создать массив из n
    случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
    массив только из четных элементов первого массива, если они там есть, и
    вывести его на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = -1;
        while (n <= 0) {
            n = scanner.nextInt();
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(n);
        }
        System.out.println(Arrays.toString(a));
        int length = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                length++;
            }
        }
        int[] b = new int[length];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[j++] = a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
