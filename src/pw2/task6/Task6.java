package pw2.task6;

import java.util.Scanner;

public class Task6 {
    /*
    10. Напишите программу HowMany.java, которая определит, сколько слов Вы ввели с консоли
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        while (true) {
            String line = scanner.nextLine();
            if (line.replace("\n", "").isEmpty()) {
                break;
            }
            amount += line.split(" ").length;
        }

        System.out.println("Количество введённых слов: " + amount);
    }
}
