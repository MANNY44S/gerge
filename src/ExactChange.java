import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input the amount in cents
        System.out.print("Enter the amount in cents (e.g., 137 for $1.37): ");
        int cents = scanner.nextInt();

        // Calculate the number of quarters, dimes, nickels, and pennies
        int quarters = cents / 25;
        cents %= 25;

        int dimes = cents / 10;
        cents %= 10;

        int nickels = cents / 5;
        cents %= 5;

        int pennies = cents;

        // Calculate the total number of coins
        int totalCoins = quarters + dimes + nickels + pennies;

        // Output the result
        System.out.println("You need the following coins:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
        System.out.println("In total, you need " + totalCoins + " coins.");

        // Close the Scanner
        scanner.close();
    }
}