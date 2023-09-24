import java.util.Scanner;

class Account {
    private String name, type;
    private long accNo;
    private double balanceAmount;

    public static int trans = 0;

    // Constructor for initialize the variables
    public Account(String n, String t, long no, double am) {
        name = n;
        type = t;
        accNo = no;
        balanceAmount = am;
    }

    // Mutator method
    public void setName(String n) {
        name=n;
    }

    public void setType(String t) {
        type=t;
    }

    public void setAcc(long no) {
        accNo = no;
    }

    public void setAmount(double am) {
        balanceAmount = am;
    }

    // Accessor method
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public long getAcc() {
        return accNo;
    }

    public double getAmount() {
        return balanceAmount;
    }

    // Balance Amount Method
    public double amount() {
        return balanceAmount;
    }

    // Deposit Method
    public void deposit(double d) {
        balanceAmount += d;
        trans++;
    }

    // Withdrawal Method
    public void withdrawal(double w) {
        if (w <= balanceAmount) {
            balanceAmount -= w;
            trans++;
        }
    }

    // ToString Method
    public String toString() {
        return "Holder Name : " + name + "\nAccount Type : " + type + "\nAccount Number : " + accNo
                + "\nBalance Amount : " + balanceAmount;
    }
}

class Driver3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, type;
        long accNo;
        double balanceAmount;

        System.out.print("Enter Account Holder Name : ");
        name = sc.nextLine();

        System.out.print("Enter Account Type : ");
        type = sc.nextLine();

        System.out.print("Enter Account Number : ");
        accNo = sc.nextLong();

        System.out.print("Enter Balance Amount : ");
        balanceAmount = sc.nextDouble();

        System.out.println("\n-----------------------------\n");

        // Create Object
        Account Ac = new Account(name, type, accNo, balanceAmount);
        System.out.println(Ac);

        System.out.println("-----------------------------");

        // For Deposit Amount
        System.out.print("\nEnter Deposit Amount : ");
        double d = sc.nextDouble();
        Ac.deposit(d);

        // Balance Amount
        System.out.println("Balance Amount : " + Ac.amount());

        System.out.println("-----------------------------");

        // For Withdrawal Amount
        System.out.print("\nEnter Withdrawal Amount : ");
        double w = sc.nextDouble();
        Ac.withdrawal(w);

        // Balance Amount
        System.out.println("Balance Amount : " + Ac.amount());

        System.out.println("-----------------------------");

        // Transaction
        System.out.println("Total Transaction : " + Ac.trans);
    }
}
