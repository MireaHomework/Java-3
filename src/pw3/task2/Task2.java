package pw3.task2;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    /*
    3. Создайте массив из 4 случайных целых чисел из отрезка [10;99],
    выведите его на экран в строку, далее определите и выведите на экран сообщение
    о том, является ли массив строго возрастающей последовательностью.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = random.nextInt(10, 100);
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean isNotIncreasing = false;
        for (int i = 1; i < 4; i++) {
            if (a[i - 1] >= a[i]) {
                isNotIncreasing = true;
                break;
            }
        }
        if (isNotIncreasing) {
            System.out.println("Не является возрастающей последовательностью");
        } else {
            System.out.println("Является возрастающей последовательностью");
        }
    }
}
