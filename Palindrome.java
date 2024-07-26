 import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
      try  (Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number to check if it is a palindrome: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
            
        }
    }
}
 
}