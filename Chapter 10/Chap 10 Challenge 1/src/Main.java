public class Main {
    public static void main(String[] args) {
        ProductionWorker person = new ProductionWorker(1, 15.00);
        person.setName("Chris");
        person.setEmployeeNumber("69");
        person.setHireDate("March 17, 2010");
        System.out.println(person.getName() + person.getEmployeeNumber() + person.getHireDate()
        + person.getShift() + person.getPayRate());

    }
}