// Circle class
public class Circle extends Shape {
    private double radius;

    public Circle(Posn center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean contains(Posn posn) {
        double distance = Math
                .sqrt(Math.pow(posn.getX() - center.getX(), 2) + Math.pow(posn.getY() - center.getY(), 2));
        return distance <= radius;
    }
}
