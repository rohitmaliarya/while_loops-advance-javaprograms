import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  
            System.out.print("Enter a number to check if it is a perfect number: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }
            int sum = 0;
            int i = 1;
            while (i <= number / 2) {
                if (number % i == 0) {
                    sum += i;
                }
                i++;
            }
            if (sum == number) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is not a perfect number.");
            }
        }
    }
}
 
    

