package Arithmetic;

public class Calculator {
    private int a;
    private int b;

    public Calculator() {
        this.a=0;
        this.b=0;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int Addition(int a,int b){
        return a+b;
    }

    public int Subtraction(int a,int b){
        return a-b;
    }

    public int Multiplication(int a,int b){
        return a*b;
    }

    public double Division(int a,int b){
        try{
            if (b==0){
                throw new ArithmeticException();
            }
            return (double)a/(double)b;
        }
        catch (ArithmeticException e) {
            return 0.0;
        }
    }
}
