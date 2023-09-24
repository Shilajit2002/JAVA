package Calculator;

public class Addition {
    public long Add(long ...arr){
        long sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
