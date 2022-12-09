import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        int questions = input.nextInt();
        int missed = input.nextInt();
        GradedActivity student = new GradedActivity();
        student.setScore(grade);
        System.out.println(student.getGrade());
        FinalExam exam = new FinalExam(questions, missed);

        System.out.println("each exam counts " + exam.getPointsEach() +
                " points. \nThe exam score is " + exam.getScore() + "\nThe " +
                "exam grade is " + exam.getGrade());


    }
}