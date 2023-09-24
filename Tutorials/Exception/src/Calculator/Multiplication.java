package Calculator;

public class Multiplication {
    public long Mul(long ...arr){
        long mul=1;
        for (int i = 0; i < arr.length; i++) {
            mul*=arr[i];
        }
        return mul;
    }
}
