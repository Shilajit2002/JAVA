package Calculator;

public class Division {
    public double Div(double a,double b){
        if(b==0)
            throw new ArithmeticException("Error : Can't Divided by Zero");
        return a/b;
    }
}
