public class Throw {
    public static void main(String[] args) {
        try{
            if(9>8){
                throw new ArithmeticException();
            }
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
