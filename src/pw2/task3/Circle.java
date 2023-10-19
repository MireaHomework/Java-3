package pw2.task3;

public class Circle {
    double x;
    double y;
    double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateCircumferenceLength() {
        return 2 * Math.PI * radius;
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }

    /**
     * @param other Another circle to compare
     * @return -1 if circle is less than another, 0 if it is equal to, or 1 if it is greater than another circle.
     */
    public int compareRadius(Circle other) {
        if (radius < other.radius) {
            return -1;
        }
        if (radius > other.radius) {
            return 1;
        }
        return 0;
    }

    public String testInfo() {
        return "Circle {\n" +
                "    x = " + x + "\n" +
                "    y = " + y + "\n" +
                "    radius = " + radius + "\n" +
                "    circumferenceLength = " + calculateCircumferenceLength() + "\n" +
                "    circleArea = " + calculateCircleArea() + "\n" +
                "}\n";
    }
}
