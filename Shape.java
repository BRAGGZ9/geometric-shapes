// Shape class
public class Shape {
    private Posn center;

    public Shape(Posn center) {
        this.center = center;
    }

    public Posn getCenter() {
        return center;
    }

    public double perimeter() {
        return 0.0;
    }

    public double area() {
        return 0.0;
    }

    public boolean contains(Posn posn) {
        return false;
    }
}
