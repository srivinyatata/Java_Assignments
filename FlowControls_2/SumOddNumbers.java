import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}
