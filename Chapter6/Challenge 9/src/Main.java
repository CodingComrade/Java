import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("enter a month");
        int month = input.nextInt();
        MonthDays getDays = new MonthDays(month, year);
        getDays.setMonth(month);
        getDays.setYear(year);
        System.out.println(getDays.getNumberOfDays());
    }
}