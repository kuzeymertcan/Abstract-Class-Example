public class Circle extends Shape2D {
    public Circle(double radius) {
        super(0, 0, radius);
    }
    public double getArea() {
        return PI*radius*radius;
    }
    @Override
    public String toString() {
        return "This is a Circle with the following dimensions:" + "\n" +
                "Radius: " + radius + "\n" +
                "Area: " + getArea() + "\n";
    }
}