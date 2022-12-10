import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Essay essayGrade = new Essay(27, 19, 15, 30);
        //essayGrade.calcGrade();
        essayGrade.setScore(essayGrade.calcGrade());
        System.out.println(essayGrade.getGrade());

    }
}