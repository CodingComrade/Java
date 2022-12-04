import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int id = input.nextInt();
        double pay = input.nextDouble();
        int hours = input.nextInt();

        Payroll chris = new Payroll(name, id);
        chris.setHoursWorked(hours);
        chris.setPayRate(pay);
        System.out.println(chris.grossPay());

    }
}