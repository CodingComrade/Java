import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        Circle newCircle = new Circle(radius);
        newCircle.setRadius(radius);

        System.out.println(newCircle.getArea());
        System.out.println(newCircle.getCircumference());
        System.out.println(newCircle.getDiameter());
    }
}