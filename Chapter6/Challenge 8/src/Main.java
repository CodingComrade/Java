import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temp = input.nextDouble();
        Temperature currentTemp = new Temperature(temp);
        currentTemp.setFtemp(temp);
        System.out.println("Current temp is: " + currentTemp.getFtemp());
        System.out.println("Current temp in Celsius is: " + currentTemp.getCelsius());
        System.out.println("Current temp in Kelvin is: " + currentTemp.getKelvin());
    }
}