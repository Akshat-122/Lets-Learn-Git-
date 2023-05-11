import java.util.Scanner;

public class SimplePendulum {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double pi = 22.0 / 7.0;

            System.out.print("Enter the length of the pendulum (in meters): ");
            double l = scanner.nextDouble();

            System.out.print("Enter the acceleration due to gravity (in m/s^2): ");
            double g = scanner.nextDouble();

            double T = 2 * pi * Math.sqrt(l / g);

            System.out.println("The time period of the Simple Pendulum is: " + T + " seconds");
        }
    }
}
