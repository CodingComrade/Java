import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        GradedActivity student = new GradedActivity();
        student.setScore(grade);
        System.out.println(student.getGrade());
    }
}