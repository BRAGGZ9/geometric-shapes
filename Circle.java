public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Posn center) {
        super(center);
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public boolean contains(Posn p) {
        double x = p.x - center.x;
        double y = p.y - center.y;
        return x * x + y * y <= radius * radius;
    }
}
