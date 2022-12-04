public class Main {
    public static void main(String[] args) {
      Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting",
              "Vice President");
      Employee employee2 = new Employee("Mark Jones", 39119, "IT",
              "Programmer");
      Employee employee3 = new Employee("Joy Rogers", 81744, "Manufactoring",
              "Engineer");

        System.out.println(employee1.getName() + "'s employee id is " + employee1.getIdNumber()
        + " and she is the " + employee1.getPosition() + " of the " + employee1.getDepartment() + " department.");

        System.out.println(employee2.getName() + "'s employee id is " + employee2.getIdNumber()
                + " and he is the " + employee2.getPosition() + " of the " + employee2.getDepartment() + " department.");

        System.out.println(employee3.getName() + "'s employee id is " + employee3.getIdNumber()
                + " and she is the " + employee3.getPosition() + " of the " + employee3.getDepartment() + " department.");
    }
}