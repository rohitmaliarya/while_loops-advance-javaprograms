 import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  
            final double BASE_TICKET_PRICE = 10.0; 
            System.out.print("Enter the age of the customer: ");
            int age = scanner.nextInt();
            double discount = 0.0;
            if (age < 12) {
                discount = 0.50; 
            } else if (age >= 65) {
                discount = 0.30;
            }
            double finalPrice = BASE_TICKET_PRICE * (1 - discount); 
            System.out.printf("The ticket price is: $%.2f%n", finalPrice);
        }
    }
}
 
    

