import java.util.Scanner;

public class UNIT1PROJECT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello! Welcome to Emmanuels restaurant!");

        // a. The group’s total bill before tip
        System.out.print("Please Enter the total bill amount: ");
        double totalBill = scan.nextDouble();

        // b. The tip percentage
        System.out.print("What percentage of the bill will you tip? (0-100): ");
        double tipPercentage = scan.nextDouble();

        // c. The tip amount added to the bill
        double tipAmount = (totalBill * tipPercentage) / 100.0;

        // d. The group’s total bill including tip
        double totalAmount = totalBill + tipAmount;

        // e. Per person cost before tip
        System.out.print("How many people are at your table?: ");
        int numberOfPeople = scan.nextInt();
        double perPersonBeforeTip = totalBill / numberOfPeople;

        // f. Per person tip amount
        double perPersonTip = tipAmount / numberOfPeople;

        // g. Per person total cost
        double perPersonTotal = totalAmount / numberOfPeople;

        // Display results with separation
        System.out.println("\n---------------------------------------");
        System.out.println("               Your Results");
        System.out.println("---------------------------------------");
        System.out.println("Group’s Total Bill Before Tip: $" + totalBill);
        System.out.println("Tip Percentage: " + tipPercentage);
        System.out.println("Tip Amount Added to the Bill: $" + tipAmount);
        System.out.println("Group’s Total Bill Including Tip: $" + totalAmount);
        System.out.println("Per Person Cost Before Tip: $" + perPersonBeforeTip);
        System.out.println("Per Person Tip Amount: $" + perPersonTip);
        System.out.println("Per Person Total Cost: $" + perPersonTotal);

        //Freestyle Feature: Round down per person tip to nearest dollar
        System.out.println("\n---------------------------------------");
        System.out.println("         Freestyle");
        System.out.println("---------------------------------------");
        System.out.print("Do you want to round down per person tip to nearest dollar? (yes/no): ");
        String roundDownOption = scan.next().toLowerCase();

        if (roundDownOption.equals("yes")) {
            // Cast to int to round down
            int roundedDownTip = (int) perPersonTip;
            double newTotalAmount = totalBill + (roundedDownTip * numberOfPeople);
            System.out.println("Per Person Tip Amount (rounded down): $" + roundedDownTip);
            System.out.println("New Group’s Total Bill Including Rounded Down Tip: $" + newTotalAmount);
        }

        System.out.println("---------------------------------------");

        // Close the scanner
        scan.close();
    }
}
