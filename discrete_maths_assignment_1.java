
import java.util.Scanner;
public class maths_assignment {

    public static double sumOfSquares(int n) {
        return (1.0 / 6.0) * n * (n + 1) * (2 * n + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get user input for n
            System.out.print("Enter a positive integer n: ");
            int n = scanner.nextInt();

            // Check if the input is a positive integer
            if (n <= 0) {
                System.out.println("Please provide a positive integer.");
            } else {
                // Calculate the sum using the formula
                double formulaResult = sumOfSquares(n);
                System.out.println("Formula Result: " + formulaResult);

                // Calculate the sum using the actual summation
                int actualSum = 0;
                for (int i = 1; i <= n; i++) {
                    actualSum += i * i;
                }
                System.out.println("Actual Result: " + actualSum);

                // Compare the results
                if (Math.abs(formulaResult - actualSum) < 1e-9) {
                    System.out.println("The formula [1^2 + 2^2 + 3^2 + ... + n^2 = (1/6) * n * (n+1) * (2n+1)] holds true for n = " + n);
                } else {
                    System.out.println("The formula does not hold true for n = " + n);
                }
                break;
            }
        }
        scanner.close();
    }
}
