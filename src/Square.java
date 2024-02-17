public class Square extends Shape2D {
    public Square(double width) {
        super(0, width, 0);
    }
    public double getArea() {
        return width*width;
    }
    @Override
    public String toString() {
        return "This is a Square with the following dimensions:" + "\n" +
                "Width: " + width + "\n" +
                "Area: " + getArea() + "\n";
    }
}