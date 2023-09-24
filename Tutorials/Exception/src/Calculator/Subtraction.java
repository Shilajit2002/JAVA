package Calculator;

public class Subtraction {
    public long Sub(long ...arr){
        long sub=-0;
        for (int i = 0; i < arr.length; i++) {
            sub-=arr[i];
        }
        return sub;
    }
}
