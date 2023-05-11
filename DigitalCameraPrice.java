import java.util.Scanner;
public class DigitalCameraPrice {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the printed price of the Digital Camera: ");
            double printedPrice = scanner.nextDouble();

            double discount = printedPrice * 0.10;
            double priceAfterDiscount = printedPrice - discount;
            double gst = priceAfterDiscount * 0.06;
            double finalPrice = priceAfterDiscount + gst;

            System.out.println("The amount to be paid by the customer is: " + finalPrice);
        }
    }
}
    

