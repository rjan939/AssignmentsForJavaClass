package WeekSixAssigment;

public class Circle {
    private static final double PI = Math.PI;
    private int radius;

    public Circle(int radiusInput) {
        this.radius = radiusInput;
    }

    public double area() {
        return PI * (radius * radius);
    }

    public double circumference() {
        return 2 * radius * PI;
    }



}
