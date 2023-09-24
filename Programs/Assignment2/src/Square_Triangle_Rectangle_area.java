import java.util.*;

class Shape {
    // Method for Square
    public double calcArea(double s) {
        return s * s;
    }

    // Method for Rectangle
    public double calcArea(double l, double w) {
        return l * w;
    }

    // Method for Triangle
    public double calcArea(double a, double b, double c) {
        double S = (a + b + c) / 2;
        return Math.sqrt(S * (S - a) * (S - b) * (S - c));
    }
}

class Driver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s, l, w, a, b, c;

        // Shape Object
        Shape area = new Shape();

        System.out.print("Enter a Side of the Square = ");
        s = sc.nextDouble();
        System.out.println("Area of a Square = " + area.calcArea(s));
        System.out.println("-------------------------------------------");

        System.out.print("Enter length of the Rectangle = ");
        l = sc.nextDouble();
        System.out.print("Enter width of the Rectangle = ");
        w = sc.nextDouble();
        System.out.println("Area of a Rectangle = " + area.calcArea(l, w));
        System.out.println("-------------------------------------------");

        System.out.print("Enter first Side of the Triangle = ");
        a = sc.nextDouble();
        System.out.print("Enter second Side of the Triangle = ");
        b = sc.nextDouble();
        System.out.print("Enter third Side of the Triangle = ");
        c = sc.nextDouble();

        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("Area of a Triangle = " + area.calcArea(a, b, c));
        } else {
            System.out.println("This three sides not make a Triangle");
        }
    }
}
