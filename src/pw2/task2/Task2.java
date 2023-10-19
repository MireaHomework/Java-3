package pw2.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*
    4. Разработайте класс Shop для, реализуйте методы добавления и удаления компьютеров в магазине, добавьте метод
    поиска в магазине компьютера, нужного пользователю. Протестируйте работу созданных классов. Данные для заполнения
    массива компьютеров вводятся с клавиатуры пользователем. Для этого реализуйте интерфейс.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание магазина
        Shop shop = new Shop();

        // Выполнение команд
        while (true) {
            System.out.print("Выберите действие:\n * add - Добавить компьютер\n * remove - Удалить компьютер\n * find - Искать по названию\n * exit - Выход\n>>>");
            String action = scanner.next().replace("\n", "").toLowerCase();
            if (action.equals("add")) {
                System.out.print("Введите название компьютера: ");
                String computerName = scanner.next().replace("\n", "");
                Shop.Computer computer = new Shop.Computer(shop.giveId(), computerName);
                shop.add(computer);
                System.out.println("Компьютер добавлен.");
            } else if (action.equals("remove")) {
                System.out.print("Введите ID компьютера: ");
                int computerId = scanner.nextInt();
                boolean successful = shop.remove(computerId);
                if (successful) {
                    System.out.println("Компьютер удалён.");
                } else {
                    System.out.println("Компьютер не найден. Возможно, введён неверный ID?");
                }
            } else if (action.equals("find")) {
                System.out.print("Введите название компьютера: ");
                String computerName = scanner.next().replace("\n", "").toLowerCase();
                ArrayList<AbstractShop.Item> foundComputers = shop.findByName(computerName);
                if (foundComputers.isEmpty()) {
                    System.out.println("Не найдено ни одного компьютера с таким названием.\n");
                    continue;
                }
                System.out.println("Найден(ы) компьютер(ы):");
                for (AbstractShop.Item computer : foundComputers) {
                    System.out.println(" * " + computer.toString());
                }
            } else if (action.equals("exit")) {
                break;
            } else {
                System.out.println("Такой команды не существует.");
            }
            System.out.println("\n");
        }
    }
}
