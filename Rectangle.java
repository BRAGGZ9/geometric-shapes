// Rectangle class
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Posn center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public boolean contains(Posn posn) {
        double halfWidth = width / 2;
        double halfHeight = height / 2;
        return posn.getX() >= center.getX() - halfWidth && posn.getX() <= center.getX() + halfWidth
                && posn.getY() >= center.getY() - halfHeight && posn.getY() <= center.getY() + halfHeight;
    }
}
