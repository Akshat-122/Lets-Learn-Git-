import java.util.Scanner;
public class ShopkeeperDiscounts {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the price of the article: ");
            double price = scanner.nextDouble();

            double discount1 = price * 0.30;
            double finalPrice1 = price - discount1;

            double discount2a = price * 0.20;
            double priceAfterDiscount2a = price - discount2a;
            double discount2b = priceAfterDiscount2a * 0.10;
            double finalPrice2 = priceAfterDiscount2a - discount2b;

            System.out.println("The first shopkeeper offers a discount of: " + discount1);
            System.out.println("The final price after the first shopkeeper's discount is: " + finalPrice1);

            System.out.println("The second shopkeeper offers two successive discounts of: " + discount2a + " and " + discount2b);
            System.out.println("The final price after the second shopkeeper's discounts is: " + finalPrice2);
        }
    }
    
}
