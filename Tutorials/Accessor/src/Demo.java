class Cylinder {
    private double radius;
    private double height;

    //  Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //  Mutator Method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  Accessor Method
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    //  Surface Area Method
    public double SA(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }

    //  Volume Method
    public double V(){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle{
    private double length;
    private double breadth;

    //  Default Constructor
    public Rectangle() {
        length=4;
        breadth=5;
    }

    //  Parameterized Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    //  Mutator Method
    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    //  Accessor Method
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}

class Sphere{
    private double radius;
    private double height;

    //  Constructor
    public Sphere(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    //  Mutator Method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  Accessor Method
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    //  Surface Area Method
    public double SA(){
        return 4*Math.PI*Math.pow(radius,2);
    }

    //  Volume Method
    public double V(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }
}

public class Demo {
    public static void main(String[] args) {
        Cylinder C=new Cylinder(20,40);
        System.out.println("Cylinder Radius : "+C.getRadius()+"\nCylinder Height : "+C.getHeight());
        System.out.println("Surface Area : "+C.SA()+"\nVolume : "+C.V());

        System.out.println("---------------------------------------");

        Rectangle R=new Rectangle(800,40);
        System.out.println("Rectangle Length : "+R.getLength()+"\nRectangle Breadth : "+R.getBreadth());

        System.out.println("---------------------------------------");

        Sphere S=new Sphere(20,40);
        System.out.println("Sphere Radius : "+S.getRadius()+"\nSphere Height : "+S.getHeight());
        System.out.println("Surface Area : "+S.SA()+"\nVolume : "+S.V());
    }
}




