public class Rectangle extends Shape2D {
    public Rectangle(double height, double width) {
        super(height, width, 0);
    }
    public double getArea() {
        return height*width;
    }
    @Override
    public String toString() {
        return "This is a Rectangle with the following dimensions:" + "\n" +
                "Height: " + height + "\n" +
                "Width: " + width + "\n" +
                "Area: " + getArea() + "\n";
    }
}