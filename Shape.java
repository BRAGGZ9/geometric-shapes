public abstract class Shape {
    protected Posn center;

    public Shape(Posn center) {
        this.center = center;
    }

    public abstract double perimeter();

    public abstract double area();

    public boolean contains(Posn p) {
        // Implement this method in each subclass
        return false;
    }

    public Posn getCenter() {
        return center;
    }
}
