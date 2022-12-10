public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Voyager", "1984");
        ships[1] = new CruiseShip("Independence", 100);
        ships[2] = new CargoShip("Cargo", 100);
        for (int i = 0; i < ships.length; i++) {
            System.out.println(ships[i].toString());
        }


    }
}