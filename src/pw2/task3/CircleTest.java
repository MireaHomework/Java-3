package pw2.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 1);
        System.out.println(circle.testInfo());

        System.out.println("Изменение координат...");
        circle.setX(10);
        circle.setY(17);
        System.out.println(circle.testInfo());

        System.out.println("Изменение радиуса...");
        circle.setRadius(8);
        System.out.println(circle.testInfo());

        System.out.println("Вычисление площади и длины окружности при радиусе 1...");
        circle.setRadius(1);
        System.out.println("Длина окружности: " + circle.calculateCircumferenceLength());
        System.out.println("Площадь: " + circle.calculateCircleArea());
    }
}
