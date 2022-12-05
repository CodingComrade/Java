import java.util.ArrayList;
import java.util.Arrays;

public class MonthDays {
    private int month;
    private int year;

    public MonthDays(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public int getNumberOfDays() {
        boolean leapYear;
        ArrayList<Integer> monthsWith31 =
                new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));
        ArrayList<Integer> monthsWith30 =
                new ArrayList<Integer>(Arrays.asList(4, 6, 9, 11));

        if (this.year % 100 == 0 && this.year % 400 == 0) {
           leapYear = true;
        } else if (this.year % 100 != 0 && this.year % 4 == 0) {
            leapYear = true;
        } else {
            leapYear = false;
        }

        if (this.month == 2 && leapYear) {
            return 29;
        } else if (this.month == 2 && !leapYear) {
            return 28;
        } else {
            return monthsWith31.contains(this.month) ? 31 : 30;
        }
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
