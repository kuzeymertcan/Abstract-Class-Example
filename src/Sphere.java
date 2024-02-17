public class Sphere extends Shape3D {
    public Sphere(double depth, double radius) {
        super(0, 0, radius, depth);
    }
    public double getVolume() {
        return ((double)4/3)*PI*radius*radius*radius;
    }
    public double getArea() {
        return 4*PI*radius*radius;
    }
    @Override
    public String toString() {
        return "This is a Sphere with the following dimensions:" + "\n" +
                "Depth: " + depth + "\n" +
                "Radius: " + radius + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Area: " + getArea() + "\n";
    }
}