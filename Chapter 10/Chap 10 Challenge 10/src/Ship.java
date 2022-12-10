public class Ship {
    private String name;
    private String year;

    public Ship(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public Ship() {

    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        String str = "Ship name: " + name + "\nYear Built: " + year;
        return str;
    }
}
