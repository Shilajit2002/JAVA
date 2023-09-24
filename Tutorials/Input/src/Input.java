import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException {
        //  Old Process
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(br);

        int n = Integer.parseInt(line);
        System.out.println(n);

        //  New Process
        Scanner S = new Scanner(System.in);

        byte a = S.nextByte();
        short b = S.nextShort();
        int c = S.nextInt();
        long d = S.nextLong();
        float e = S.nextFloat();
        double f = S.nextDouble();
        char g = S.next().charAt(0);
        String h = S.next();    //This will not add after space strings
        String k = S.nextLine(); //This will add after space strings
        boolean i = S.nextBoolean();
        boolean j = S.nextBoolean();

        System.out.println(
                a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + i + " " + j + " " + k);
    }
}
