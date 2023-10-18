package pw1.task1;

import java.util.Scanner;

public class Task1 {
    /*
    3. Написать программу, в результате которой массив чисел создается с помощью инициализации (как в Си) вводится и
    считается в цикле сумма элементов целочисленного массива, а также среднее арифметическое его элементов результат
    выводится на экран. Использовать цикл for
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Цикл ввода
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = scanner.nextInt();
        }

        // Цикл подсчёта суммы
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        // Вычисление среднего арифметического
        double average = (double) sum / size;

        // Вывод
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
