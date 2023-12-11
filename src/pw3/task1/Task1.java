package pw3.task1;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    /*
    1. Создать массив вещественных чисел случайным образом, вывести его
    на экран, отсортировать его, и снова вывести на экран (использовать два подхода
    к генерации случайных чисел – метод random() класса Math и класс Random)
     */
    public static void main(String[] args) {
        arrayByMath();
        arrayByRandom();
    }

    // Массив через Math.random
    public static void arrayByMath() {
        double[] array = new double[(int) (Math.random() * 10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    // Массив через Random.nextDouble
    public static void arrayByRandom() {
        Random random = new Random();
        double[] array = new double[random.nextInt(10)];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(1, 100);
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
