public class ProductionWorker extends Employee{
  private int shift; //shift is either 1 (day shift) or 2 (night shift)
  private double payRate;

  public ProductionWorker(int shift, double payRate) {
      this.shift = shift;
      this.payRate = payRate;
  }

  public ProductionWorker() {

  }

  public int getShift() {
      return shift;
  }

  public double getPayRate() {
      return payRate;
  }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
