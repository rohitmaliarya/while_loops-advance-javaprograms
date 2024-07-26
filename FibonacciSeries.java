import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  // Try-with-resources statement
            System.out.print("Enter the number of terms for Fibonacci series: ");
            int n = scanner.nextInt();
            int a = 0, b = 1, i = 1;

            while (i <= n) {
                System.out.print(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
                i++;
            }
        }
    }
}
 


