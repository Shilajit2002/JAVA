import java.util.Scanner;

class Fraction {
    // Define Variables
    private int numerator;
    private int denominator;

    // Constructor Initialization
    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }

    // Mutator Method
    public void setNumerator(int num) {
        numerator = num;
    }

    public void setDenominator(int den) {
        denominator = den;
    }

    // Accessor Method
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    // Method for GetValue
    public double getValue() {
        return (double) numerator / denominator;
    }

    // ToString Methods
    public String toString() {
        return numerator + "/" + denominator;
    }

    // GCD method
    public int gcd(int a, int b) {
        if (b != 0) {
            return gcd(b, a % b);
        } else {
            return a;
        }
    }

    // Addition Method
    public Fraction Add(Fraction F) {
        int num = numerator * F.denominator + F.numerator * denominator;

        int den = denominator * F.denominator;

        // Dividing the fraction
        int c = gcd(num, den);
        num /= c;
        den /= c;

        // Return a new Object reference
        return new Fraction(num, den);
    }

    // Subtraction Method
    public Fraction Sub(Fraction F) {
        int num = numerator * F.denominator - F.numerator * denominator;

        int den = denominator * F.denominator;

        // Dividing the fraction
        int c = gcd(num, den);
        num /= c;
        den /= c;

        // Return a new Object reference
        return new Fraction(num, den);
    }

    // Multiplication Method
    public Fraction Mul(Fraction F) {
        int num = numerator * F.numerator;

        int den = denominator * F.denominator;

        // Dividing the fraction
        int c = gcd(num, den);
        num /= c;
        den /= c;

        // Return a new Object reference
        return new Fraction(num, den);
    }

    // Division Method
    public Fraction Div(Fraction F) {
        int num = numerator * F.denominator;

        int den = denominator * F.numerator;

        // Dividing the fraction
        int c = gcd(num, den);
        num /= c;
        den /= c;

        // Return a new Object reference
        return new Fraction(num, den);
    }

    // Equals Method
    public boolean equals(Object O){
        if(O instanceof Fraction){
            Fraction F=(Fraction)O;
            if(this.numerator*F.denominator==this.denominator*F.numerator){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}

class Driver5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, d1, n2, d2;

        System.out.print("Enter Fraction1 Numerator = ");
        n1 = sc.nextInt();
        System.out.print("Enter Fraction1 Denominator = ");
        d1 = sc.nextInt();

        System.out.print("Enter Fraction2 Numerator = ");
        n2 = sc.nextInt();
        System.out.print("Enter Fraction2 Denominator = ");
        d2 = sc.nextInt();

        System.out.println("-------------------------------------------------");

        // Fraction1 Object
        Fraction F1 = new Fraction(n1, d1);

        // Print Fraction1 Value
        System.out.println("Fraction1 : " + F1 + " = " + F1.getValue());

        // Fraction2 Object
        Fraction F2 = new Fraction(n2, d2);

        // Print Fraction2 Value
        System.out.println("Fraction2 : " + F2 + " = " + F2.getValue());

        System.out.println("-------------------------------------------------");

        // Equals Check
        if(F1.equals(F2)){
            System.out.println(F1+" Equals to "+F2);
        }
        else{
            System.out.println(F1+" Not Equals to "+F2);
        }

        System.out.println("-------------------------------------------------");

        // Print Addition
        System.out.println("Addition : " + F1 + " + " + F2 + " = " + F1.Add(F2));

        // Print Subtraction
        System.out.println("Subtraction : " + F1 + " - " + F2 + " = " + F1.Sub(F2));

        // Print Multiplication
        System.out.println("Multiplication : " + F1 + " * " + F2 + " = " + F1.Mul(F2));

        // Print Division
        System.out.println("Division : " + F1 + " / " + F2 + " = " + F1.Div(F2));
    }
}
