public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println(e);
        }
        //  finally always execute
        finally {
            System.out.println("Always Executed");
        }

        try {
            System.out.println("Hello");
        }
        //  finally always execute
        finally {
            System.out.println("Always Executed");
        }
    }
}
