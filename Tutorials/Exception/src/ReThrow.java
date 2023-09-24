public class ReThrow {
    public static void main(String[] args) {
        try {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println(e);
                throw e;
            }
        } catch (Exception e) {
            System.out.println(e + " Caught");
        }
    }
}
