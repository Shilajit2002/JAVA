package Account;

import java.util.Scanner;

class TestBankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number : ");
        long accNo = sc.nextLong();
        System.out.print("Enter Account Type : ");
        String type = sc.next();

        double d, w, balanceAmount;

        if (type.equalsIgnoreCase("Savings")) {
            System.out.print("Enter Balance Amount || Initial Balance should be 500: ");
            balanceAmount = sc.nextDouble();
            System.out.print("Enter Interest Rate : ");
            double interestRate = sc.nextDouble();
            int choice = 0;

            System.out.println("\n**Savings Account**\n");

            SavingsAccount S = new SavingsAccount(name, accNo, balanceAmount, interestRate);
            System.out.println(S);
            System.out.println("-----------------------------------");
            do {
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdrawal Money");
                System.out.println("3.Total Transaction");
                System.out.println("4.Exit");
                System.out.print("Enter your choice : ");
                choice = sc.nextInt();
                System.out.println("-----------------------------------");
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Deposit Amount : ");
                        d = sc.nextDouble();
                        S.deposit(d);
                        System.out.println("Balance Amount : " + S.getBalanceAmount());
                    }
                    case 2 -> {
                        System.out.print("Enter Withdrawal Amount : ");
                        w = sc.nextDouble();
                        S.withdrawal(w);
                        System.out.println("Balance Amount : " + S.getBalanceAmount());
                    }
                    case 3 -> {
                        System.out.println("Total Transaction = " + S.trans);
                    }
                    case 4 -> {
                        System.out.println("Quiting.....");
                    }
                    default -> System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        } else if (type.equalsIgnoreCase("Current")) {
            System.out.print("Enter Balance Amount || Initial Balance should be 5000: ");
            balanceAmount = sc.nextDouble();
            System.out.print("Enter Overdraft Limit : ");
            double overdraftLimit = sc.nextDouble();
            int choice = 0;

            System.out.println("\n**Current Account**\n");

            CurrentAccount C = new CurrentAccount(name, accNo, balanceAmount, overdraftLimit);
            System.out.println(C);
            System.out.println("-----------------------------------");
            do {
                System.out.println("1.Deposit Money");
                System.out.println("2.Withdrawal Money");
                System.out.println("3.Total Transaction");
                System.out.println("4.Exit");
                System.out.print("Enter your choice : ");
                choice = sc.nextInt();
                System.out.println("-----------------------------------");
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Deposit Amount : ");
                        d = sc.nextDouble();
                        C.deposit(d);
                        System.out.println("Balance Amount : " + C.getBalanceAmount());
                    }
                    case 2 -> {
                        System.out.print("Enter Withdrawal Amount : ");
                        w = sc.nextDouble();
                        C.withdrawal(w);
                        System.out.println("Balance Amount : " + C.getBalanceAmount());
                    }
                    case 3 -> {
                        System.out.println("Total Transaction = " + C.trans);
                    }
                    case 4 -> {
                        System.out.println("Quiting.....");
                    }
                    default -> System.out.println("Invalid Choice");
                }
            } while (choice != 4);
        }
    }
}
