package pw2.task4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    /*
    8. Напишите программу, которая меняет местами элементы одномерного массива из String в обратном порядке.
    Не используйте дополнительный массив для хранения результатов
    */

    public static void main(String[] args) {
        int size = 5;
        String[] array = new String[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = String.valueOf(random.nextInt(10, 100));
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < size / 2; i++) {
            String temp = array[i];
            array[i] = array[size - i - 1];
            array[size - i - 1] = temp;
        }
        System.out.println("Перевёрнутый массив: " + Arrays.toString(array));
    }
}
