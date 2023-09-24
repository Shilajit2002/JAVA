package Account;

class SavingsAccount extends Account {
    private double interestRate;

    //  Default Constructor
    public SavingsAccount() {
        interestRate = 0.0;
    }

    //  Parameterized Constructor
    public SavingsAccount(String name, long accNo, double balanceAmount, double interestRate) {
        super.setName(name);
        super.setAccNo(accNo);
        if (balanceAmount >= 500) {
            super.setBalanceAmount(balanceAmount);
        }
        this.interestRate = interestRate;
    }

    //  Mutator Method
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    //  Accessor Method
    public double getInterestRate() {
        return interestRate;
    }

    //  Compute Interest Method
    public double computeInterest() {
        double SI = (super.getBalanceAmount() * interestRate) / 100;
        super.setBalanceAmount(super.getBalanceAmount() + SI);
        return SI;
    }

    // Deposit Method Override
    public void deposit(double d) {
        if (d > 0) {
            super.deposit(d);
        }
    }

    // Withdrawal Method Override
    public void withdrawal(double w) {
        if (w > 0 && super.getBalanceAmount() >= w) {
            super.withdrawal(w);
            if (super.getBalanceAmount() <= 500) {
                super.setBalanceAmount(super.getBalanceAmount() - 10);
            }
        }
    }

    //  ToString Method
    public String toString() {
        return super.toString() + "\nInterest : " + computeInterest()
                + "\nBalance Amount : " + super.getBalanceAmount();
    }
}