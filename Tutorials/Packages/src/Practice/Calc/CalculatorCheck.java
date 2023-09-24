package Practice.Calc;

import java.util.Scanner;

class Calculator{
    public void Calculate(int a,int b){
        System.out.println("A + B = "+(a+b));
    }
}

class ScCalculator{
    public void Calculate(int a,int b){
        System.out.println("Sin(A + B) = "+Math.sin(a+b));
    }
}

class HybridCalculator{
    public void Calculate(int a,int b){
        System.out.println("A + B = "+(a+b));
        System.out.println("Sin(A + B) = "+Math.sin(a+b));
    }
}

public class CalculatorCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculator C = new Calculator();
        ScCalculator SC = new ScCalculator();
        HybridCalculator HC = new HybridCalculator();

        C.Calculate(10,20);
        SC.Calculate(10,20);
        HC.Calculate(10,20);
    }
}
