public class Cone extends Shape3D {
    public Cone(double height, double radius) {
        super(height, 0, radius, 0);
    }
    public double getVolume() {
        return PI*Math.pow(radius, 2)*(height/3);
    }
    public double getArea() {
        return PI*radius*(radius+Math.sqrt(Math.pow(height, 2)+Math.pow(radius, 2)));
    }
    @Override
    public String toString() {
        return "This is a Cone with the following dimensions:" + "\n" +
                "Height: " + height + "\n" +
                "Radius: " + radius + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Area: " + getArea() + "\n";
    }
}