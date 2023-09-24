package Geometric;

class Triangle extends GeometricObject {
    private double a;
    private double b;
    private double c;

    //  Default Constructor
    public Triangle() {
        a = 0.0;
        b = 0.0;
        c = 0.0;
    }

    //  Parameterized Constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //  Mutator Method
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    //  Accesses Method
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    //  Find Area Method
    public double findArea() {
        if ((a + b > c) && (b + c) > a && (a + c) > b) {
            double S = (a + b + c) / 2;
            return Math.sqrt(S * (S - a) * (S - b) * (S - c));
        }
        return 0.0;
    }

    //  Find Circumference Method
    public double findCircumference() {
        if ((a + b > c) && (b + c) > a && (a + c) > b) {
            return a + b + c;
        }
        return 0.0;
    }
}
