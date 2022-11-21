public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee(String name, int id, String department,
                    String position) {
        this.name = name;
        this.idNumber = id;
        this.department = department;
        this.position = position;

    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;

    }

    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
