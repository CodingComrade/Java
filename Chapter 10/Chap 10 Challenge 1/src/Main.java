public class Main {
    public static void main(String[] args) {
        ProductionWorker person = new ProductionWorker(1, 15.00);
        person.setName("Chris");
        person.setEmployeeNumber("69");
        person.setHireDate("March 17, 2010");
        System.out.println(person.getName() + person.getEmployeeNumber() + person.getHireDate()
        + person.getShift() + person.getPayRate());

        ShiftSupervisor manager = new ShiftSupervisor(50000, 5000);
        manager.setName("Laura");
        System.out.println(manager.getName() + " makes " + manager.getSalary());

        TeamLeader Katia = new TeamLeader(10000, 10, 100);

        Katia.setName("Katia");
        System.out.println(Katia.getName());

    }
}