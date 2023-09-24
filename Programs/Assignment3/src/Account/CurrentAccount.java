package Account;

class CurrentAccount extends Account {
    private double overDraftLimit;

    //  Default Constructor
    public CurrentAccount() {
        overDraftLimit = 5000;
    }

    //  Parameterized Constructor
    public CurrentAccount(String name, long accNo, double balanceAmount, double overDraftLimit) {
        super.setName(name);
        super.setAccNo(accNo);
        if (balanceAmount >= 5000) {
            super.setBalanceAmount(balanceAmount);
        }
        this.overDraftLimit = overDraftLimit;
    }

    //  Mutator Method
    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    //  Accessor Method
    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    //  Deposit Method
    public void deposit(double d) {
        if (d > 0) {
            super.deposit(d);
        }
    }

    //  Withdrawal Method
    public void withdrawal(double w) {
        if (w > 0) {
            if (super.getBalanceAmount() >= w) {
                super.withdrawal(w);
            } else {
                if (super.getBalanceAmount() - w <= -getOverDraftLimit()) {
                    super.setBalanceAmount(super.getBalanceAmount() - w - 50);
                    super.trans++;
                } else {
                    super.setBalanceAmount(super.getBalanceAmount() - w);
                    super.trans++;
                }
            }
        }
    }

    //  ToString Method
    public String toString() {
        return super.toString() + "\nOverDraftLimit = " + getOverDraftLimit();
    }
}
