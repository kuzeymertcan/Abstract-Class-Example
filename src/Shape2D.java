public abstract class Shape2D {
    public final double PI = Math.PI;
    public double height;
    public double width;
    public double radius;
    public Shape2D(double height, double width, double radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }
    public abstract double getArea();
    @Override
    public abstract String toString();
}