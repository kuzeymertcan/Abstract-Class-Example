public class Cylinder extends Shape3D {
    public Cylinder(double height, double radius) {
        super(height, 0, radius, 0);
    }
    public double getVolume() {
        return PI*radius*radius*height;
    }
    public double getArea() {
        return 2*PI*radius*(height+radius);
    }
    @Override
    public String toString() {
        return "This is a Cylinder with the following dimensions:" + "\n" +
                "Height: " + height + "\n" +
                "Radius: " + radius + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Area: " + getArea() + "\n";
    }
}