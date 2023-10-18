package pw1.task2;

import java.util.Scanner;

public class Task2 {
    /*
    4. Написать программу, в результате которой массив чисел вводится пользователем с клавиатуры считается сумма элементов
    целочисленного массива с помощью циклов do while, while, также необходимо найти максимальный и минимальный элемент
    в массиве, результат выводится на экран
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Цикл ввода
        int i = 0;
        while (i < size) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = scanner.nextInt();
            i++;
        }

        // Цикл подсчёта суммы и поиска минимума и максимума
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        i = 0;
        while (i < size) {
            int element = array[i];
            sum += element;
            if (element > max) max = element;
            if (element < min) min = element;
            i++;
        }

        // Вывод
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}
