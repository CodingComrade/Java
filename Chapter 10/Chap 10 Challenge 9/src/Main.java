public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount();
        account.setBalance(1000);
        account.isActive();
        account.withdraw(100);
        account.depositIfActive(150);
        account.setInterestRate(.05);
        account.calcInterest();
        account.setServiceCharge(5);
        account.monthlyProcess();
        System.out.println(account.getBalance());
    }
}