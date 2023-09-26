import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();

        double quotient = num1 / num2;               // Line A
        int sum = num1 + num2;                       // Line B

        System.out.println("The quotient is " + quotient);
        System.out.println("The sum is " + sum);
    }
}
