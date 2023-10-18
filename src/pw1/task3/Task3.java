package pw1.task3;

public class Task3 {
    /*
    6. Написать программу, в результате работы которой выводятся на экран первые 10 чисел гармонического ряда
    (форматировать вывод)
     */
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда: ");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("%.2f ", harmonic);
        }
    }
}
