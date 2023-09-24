package Account;

class Account {
    private String name;
    private long accNo;
    private double balanceAmount;
    public static int trans = 0;

    //  Default Constructor
    public Account() {
        this.name="";
        this.accNo=0;
        this.balanceAmount=0.0;
    }

    // Constructor for initialize the variables
    public Account(String name, long accNo, double balanceAmount) {
        this.name = name;
        this.accNo = accNo;
        this.balanceAmount = balanceAmount;
    }

    // Mutator method
    public void setName(String name) {
        this.name = name;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    // Accessor method
    public String getName() {
        return name;
    }

    public long getAccNo() {
        return accNo;
    }

    public double getBalanceAmount() {
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
        return "Holder Name : " + getName() + "\nAccount Number : " + getAccNo()
                + "\nBalance Amount : " + getBalanceAmount();
    }
}