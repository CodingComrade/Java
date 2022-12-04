public class Temperature {
    private double ftemp;

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public void setFtemp(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFtemp() {
        return ftemp;
    }

    public double getCelsius() {
        return ((5.0/9.0) * ftemp - 32);
    }

    public double getKelvin() {
        return ((5.0/9.0) * (ftemp - 32) + 273);
    }
}
