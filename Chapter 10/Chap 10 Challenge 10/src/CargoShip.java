public class CargoShip extends Ship{
    private int cargo;

    public CargoShip(String name, int cargo) {
        setName(name);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        String str = "The ship's name is: " + getName() + "\nand the cargo " +
                "capactiy is: " + cargo;
        return str;
    }
}
