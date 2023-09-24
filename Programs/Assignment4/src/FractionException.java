import java.util.Random;

public class FractionException {
    public static void main(String[] args) {
        Random random = new Random();

        int numerator, denominator;

        for (int i = 0; i < 10; i++) {
            //  Randomly generate the numerator & denominator
            numerator = random.nextInt(9) + 1;
            denominator = random.nextInt(5);
            try {
                //  Divide by Zero Exception
                if (denominator == 0)
                    throw new ArithmeticException();
                System.out.printf(+numerator + " / " + denominator + " = %.3f\n",
                        ((double) numerator / (double) denominator));
            } catch (ArithmeticException e) {
                //  Print the origin of the exception caught
                System.out.println(e);
            }
        }
    }
}
