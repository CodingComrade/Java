public class ShiftSupervisor extends Employee{
    private int salary;
    private int bonus;

    public ShiftSupervisor(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
