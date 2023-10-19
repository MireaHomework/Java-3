package pw2.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class ShopTest {
    public static void main(String[] args) {
        System.out.println("Создание магазина...");
        Shop shop = new Shop();
        System.out.println(shop.testInfo());

        System.out.println("Добавление компьютеров...");
        shop.add(new Shop.Computer(shop.giveId(), "hp"));
        shop.add(new Shop.Computer(shop.giveId(), "hp"));
        shop.add(new Shop.Computer(shop.giveId(), "hp"));
        shop.add(new Shop.Computer(shop.giveId(), "lenovo"));
        shop.add(new Shop.Computer(shop.giveId(), "lenovo"));
        System.out.println(shop.testInfo());

        System.out.println("Удаление компьютера с ID=1...");
        shop.remove(1);
        System.out.println(shop.testInfo());

        System.out.println("Удаление компьютера с ID=10...");
        shop.remove(10);
        System.out.println(shop.testInfo());

        System.out.println("Поиск компьютеров с именем \"lenovo\"...");
        ArrayList<AbstractShop.Item> computers = shop.findByName("lenovo");
        System.out.println("Найдены: " + Arrays.toString(computers.toArray()));
    }
}
