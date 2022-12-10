public abstract class BankAccount {
    private int balance;
    private int deposits; //number of deposits
    private int withdrawals;
    private double interestRate;
    private int serviceCharge;

    public BankAccount(int balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public BankAccount() {

    }

    public int deposit(int deposit) {
        this.deposits += 1;
        balance += deposit;
        return balance;
    }

    public int withdrawal(int withdrawal) {
        this.withdrawals += 1;
        balance -= withdrawal;
        return balance;
    }

    public void calcInterest() {
        double MonthlyInterestRate = (interestRate / 12);
        double MonthlyInterest = balance * MonthlyInterestRate;
        balance += MonthlyInterest;
    }

    public void monthlyProcess() {
        balance -= serviceCharge;
        calcInterest();
        withdrawals = 0;
        deposits = 0;
        serviceCharge = 0;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public void setWithdrawals(int withdrawals) {
        this.withdrawals = withdrawals;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public int getBalance() {
        return balance;
    }

    public int getDeposits() {
        return deposits;
    }

    public int getWithdrawals() {
        return withdrawals;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }
}
