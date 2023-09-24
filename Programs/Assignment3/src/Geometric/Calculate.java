package Geometric;

import java.util.Scanner;

class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Side of the Triangle = ");
        double a = sc.nextDouble();
        System.out.print("Enter Second Side of the Triangle = ");
        double b = sc.nextDouble();
        System.out.print("Enter Third Side of the Triangle = ");
        double c = sc.nextDouble();

        Triangle T = new Triangle(a, b, c);
        System.out.printf("Area of the Triangle is = %.3f\n", T.findArea());
        System.out.println("Circumference of the Triangle is = " + T.findCircumference());
    }
}
