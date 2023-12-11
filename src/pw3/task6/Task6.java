package pw3.task6;

import pw3.task5.CurrencyConverter;

import java.util.Scanner;

public class Task6 {
    /*
    2. Создать мини-Приложение интернет-магазин. В приложении
    рассчитывается стоимость покупки товара, где пользователь может выбрать
    валюту для оплаты товара
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Доступные валюты");
        System.out.println("1. Рубли");
        System.out.println("2. Доллары");
        System.out.print("Введите номер валюты для оплаты: ");
        int choice = sc.nextInt();
        String currency = "долларах";
        if (choice == 2) {
            currency = "рублях";
        }
        System.out.print("Введите стоимость ваших покупок в " + currency + ": ");
        double price = sc.nextDouble();
        if (choice == 1){
            System.out.println("Стоимость в рублях: " + CurrencyConverter.dollarsToRubles(price));
        } else {
            System.out.println("Стоимость в долларах: " + CurrencyConverter.rublesToDollars(price));
        }
    }
}
