public class Payroll {
    private String name;
    private int id;
    private double payRate;
    private int hoursWorked;

    public Payroll(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public double grossPay() {
        return payRate * hoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

}
