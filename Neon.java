
 import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square != 0) {
            int digit = square % 10;
            sumOfDigits += digit;
            square /= 10;
        }
        
        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }
    }
}

    
}
