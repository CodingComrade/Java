import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score1 = input.nextInt();
        int score2 = input.nextInt();
        int score3 = input.nextInt();

        TestScores student = new TestScores();
        student.setScore1(score1);
        student.setScore2(score2);
        student.setScore3(score3);
        System.out.println(student.average());
    }
}