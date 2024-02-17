class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(11);
        Square mySquare = new Square(22);
        Rectangle myRectangle = new Rectangle(33, 44);
        Cylinder myCylinder = new Cylinder(55, 66);
        Sphere mySphere = new Sphere(77, 88);
        Pyramid myPyramid = new Pyramid(99, 110, 121);
        Cone myCone = new Cone(132, 143);
        Shape2D[] myShapes = {myCircle, mySquare, myRectangle, myCylinder, mySphere, myPyramid, myCone};
        for(Shape2D s : myShapes) {
            System.out.println(s);
        }
    }
}