public abstract class Shape3D extends Shape2D {
    double depth;
    Shape3D(double height, double width, double radius, double depth) {
        super(height, width, radius);
        this.depth = depth;
    }
    public abstract double getVolume();
    @Override
    public abstract String toString();
}