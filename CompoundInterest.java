import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the principal sum: ");
            double principal = scanner.nextDouble();
            double rate = 0.05;

            double firstYearInterest = principal * rate;
            double firstYearBalance = principal + firstYearInterest;

            double secondYearInterest = firstYearBalance * rate;
            double secondYearBalance = firstYearBalance + secondYearInterest;

            double thirdYearInterest = secondYearBalance * rate;

            System.out.println("Interest for the first year: " + firstYearInterest);
            System.out.println("Interest for the second year: " + secondYearInterest);
            System.out.println("Interest for the third year: " + thirdYearInterest);
        }
    }
}