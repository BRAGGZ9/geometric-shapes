public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, Posn center) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double area() {
        return width * height;
    }

    public boolean contains(Posn p) {
        double x = p.x - center.x;
        double y = p.y - center.y;
        return Math.abs(x) <= width / 2 && Math.abs(y) <= height / 2;
    }
}
