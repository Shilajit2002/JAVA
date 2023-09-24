import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        //  Normal try-catch
        try {
            //  code
        } catch (Exception e) {
            System.out.println(e);
        }

        //  try-catch-catch
        try {
            throw new IOException();
        } catch (IOException e) {

        } catch (ArithmeticException e) {

        } catch (ArrayIndexOutOfBoundsException e) {

        } catch (Exception e) {

        }

        //  Nested try-catch
        for (int i = 0; i < 2; i++) {
            try {
                int a=1/i;
                try {
                    int arr[] = new int[2];
                    arr[5] = 9;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Inner Catch Block");
                }
            } catch (ArithmeticException e) {
                System.out.println("Outer Catch Block");
            }
        }
    }
}
