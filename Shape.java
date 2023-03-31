// Shape class
// public class Shape {
//     private Posn center;

//     public Shape(Posn center) {
//         this.center = center;
//     }

//     public Posn getCenter() {
//         return center;
//     }

//     public double perimeter() {
//         return 0.0;
//     }

//     public double area() {
//         return 0.0;
//     }

//     public boolean contains(Posn posn) {
//         return false;
//     }
// }

public class Shape {
    // Declare the center field as private
    private Posn center;

    // Add a public getter method to access the center field
    public Posn getCenter() {
        return center;
    }

    // Constructor to initialize the center field
    public Shape(Posn center) {
        this.center = center;
    }

    // Other methods and fields in the Shape class
}
