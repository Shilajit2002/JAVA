import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float initial_balance, interest_rate, SI, new_balance;
        int year;

        System.out.print("Enter the Initial  Balance = ");
        initial_balance = sc.nextFloat();
        System.out.print("Enter Interest Rate in Percentage = ");
        interest_rate = sc.nextFloat();
        System.out.print("Enter total year = ");
        year = sc.nextInt();

        System.out.println("YEAR\tOLD BALANCE\tINTEREST\tNEW BALANCE");
        for (int i = 1; i <= year; i++) {
            System.out.printf("%d\t\t%.2f\t\t", i, initial_balance);
            SI = (initial_balance * interest_rate) / 100;
            System.out.printf("%.2f\t\t",SI);
            new_balance = initial_balance + SI;
            initial_balance = new_balance;
            System.out.printf("%.2f\n", new_balance);
        }
    }
}
