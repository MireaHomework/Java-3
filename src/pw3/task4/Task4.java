package pw3.task4;

import java.util.Scanner;

public class Task4 {
    /*
    1. Создайте объекты класса Double, используя методы valueOf().
    2. Преобразовать значение типа String к типу double. Используем
    метод Double.parseDouble().
    3. Преобразовать объект класса Double ко всем примитивным типам.
    4. Вывести значение объекта Double на консоль.
    5. Преобразовать литерал типа double к строке: String d =
    Double.toString(3.14);
     */
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        Double num1 = Double.valueOf(scanner.nextDouble());
        Double num2 = Double.valueOf(scanner.nextDouble());
        System.out.println(num1);
        System.out.println(num2);
        //2
        double a = Double.parseDouble(scanner.next());
        System.out.println(a);
        //3
        Double val = 3.14;
        int valInt = Integer.parseInt(String.valueOf(Math.round(val)));
        double valDouble = val;
        float valFloat = Float.parseFloat(String.valueOf(val));
        byte valByte = Byte.parseByte(String.valueOf(Math.round(val)));
        long valLong = Long.parseLong(String.valueOf(Math.round(val)));
        short valShort = Short.parseShort(String.valueOf(Math.round(val)));
        //4
        System.out.println(val);
        //5
        String d = Double.toString(3.14);
    }
}
