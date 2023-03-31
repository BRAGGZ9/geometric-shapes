public class Main {
    public static void main(String[] args) {
        Posn center = new Posn(0, 0);
        Shape shape1 = new Rectangle(4, 2, center);
        Shape shape2 = new Circle(3, center);

        System.out.println("Shape 1 perimeter: " + shape1.perimeter());
        System.out.println("Shape 1 area: " + shape1.area());
        System.out.println("Shape 1 contains (1, 1): " + shape1.contains(new Posn(1, 1)));

        System.out.println("Shape 2 perimeter: " + shape2.perimeter());
        System.out.println("Shape 2 area: " + shape2.area());
        System.out.println("Shape 2 contains (1, 1): " + shape2.contains(new Posn(1, 1)));
    }
}
