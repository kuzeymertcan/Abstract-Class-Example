public class Pyramid extends Shape3D {
    public Pyramid(double depth, double height, double width) {
        super(height, width, 0, depth);
    }
    public double getVolume() {
        return (width*depth*height)/3;
    }
    public double getArea() {
        return width*depth+width*Math.sqrt(Math.pow(((double)depth/2),2)+
                Math.pow(height, 2))+depth*Math.sqrt(Math.pow(((double)width/2),2)+
                Math.pow(height, 2));
    }
    @Override
    public String toString() {
        return "This is a Pyramid with the following dimensions:" + "\n" +
                "Depth: " + depth + "\n" +
                "Height: " + height + "\n" +
                "Width: " + width + "\n" +
                "Volume: " + getVolume() + "\n" +
                "Area: " + getArea() + "\n";
    }
}