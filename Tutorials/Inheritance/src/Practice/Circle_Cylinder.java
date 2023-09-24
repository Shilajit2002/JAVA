package Practice;

class Circle{
    //  Instance Variable
    private double radius;

    //  Default Constructor
    public Circle() {
        this.radius=0.0;
    }

    //  Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //  Mutator & Accessor Method
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //  Area Method
    public double Area(){
        return Math.PI*Math.pow(this.radius,2);
    }

    @Override
    public String toString() {
        return "Radius = " + radius;
    }
}

class Cylinder extends Circle{
    //  Instance Variable
    private double height;

    //  Default Constructor
    public Cylinder() {
        this.height=0.0;
    }

    //  Parameterized Constructor
    public Cylinder(double radius,double height) {
        super(radius);
        this.height = height;
    }

    //  Mutator & Accessor Method
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //  Area Method
    public double Volume(){
        return Math.PI*Math.pow(super.getRadius(),2)*this.height;
    }

    @Override
    public String toString() {
        return " Height=" + height;
    }
}

public class Circle_Cylinder {
    public static void main(String[] args) {
        System.out.println("-------Circle--------");
        Circle C = new Circle(10);
        System.out.println(C);
        System.out.println("Area : "+C.Area());

        System.out.println("-------Cylinder--------");
        Cylinder CL = new Cylinder(10,20);
        System.out.println(CL);
        System.out.println("Volume : "+CL.Volume());
    }
}
