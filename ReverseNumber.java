import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)){
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reverse);
    }
}
}
