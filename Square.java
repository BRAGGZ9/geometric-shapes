// Square class
public class Square extends Shape {
    private double side;
    private Posn center;

    public Square(Posn center, double side) {
        super(center);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public boolean contains(Posn posn) {
        double halfSide = side / 2;
        return posn.getX() >= center.getX() - halfSide && posn.getX() <= center.getX() + halfSide
                && posn.getX() >= center.getX() - halfSide && posn.getX() <= center.getX() + halfSide;
    }
}
