public class SavingsAccount extends BankAccount{
    private boolean active;

    public boolean isActive() {
        if (getBalance() > 25) {
            active = true;
        } else {
            active = false;
        }
        return active;
    }


    public void withdraw(int amount) {
        if (active) {
            withdrawal(amount);
        } else {
            System.out.println("Account is inactive due to balance being less" +
                    " than $25");
        }
    }

    public void depositIfActive(int amount) {
        if (active) {
            deposit(amount);
        } else {
            System.out.println("Account is inactive due to balance being less" +
                    " than $25");
        }
    }

//    public void monthlyProcess() {
//        int balance = 0;
//        if (getWithdrawals() > 4) {
//           balance = getBalance() - (getWithdrawals() - 4);
//        }
//        System.out.println(balance);
//    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
