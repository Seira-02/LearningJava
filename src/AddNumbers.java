import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Adding the numbers
        int sum = num1 + num2;

        // Display result
        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}
