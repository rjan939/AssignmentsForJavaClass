package WeekSixAssigment;

public class Circle {
    private final double pi = Math.PI;
    private final int radius;

    public Circle(int radiusInput) {
        this.radius = radiusInput;
    }

    public double area() {
        return pi * (radius * radius);
    }

    public double circumference() {
        return 2 * radius * pi;
    }



}