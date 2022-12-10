public class CruiseShip extends Ship{
    private int maxPassengers;

    public CruiseShip(String name, int maxPassengers) {
        setName(name);
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


    public String toString() {
        String str =
                "Ship's name is: " + getName() + "\nMax passengers is: " + maxPassengers;
        return str;
    }
}
