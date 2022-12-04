public class Main {
    public static void main(String[] args) {
        Car ferrari = new Car(2020, "ferrari");

            for (int i = 0; i < 5; i++) {
                ferrari.accelerate();
                System.out.println("Your speed is: " + ferrari.getSpeed());
            }

            for (int i = 0; i < 5; i++) {
                ferrari.brake();
                System.out.println("Your speed is: " + ferrari.getSpeed());
            }
    }
}