package Assignment5;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base number: ");
        int baseNumber = scanner.nextInt();

        System.out.println("Enter the exponent: ");
        int exponent = scanner.nextInt();
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * baseNumber;
        }
        System.out.print(baseNumber + " to the power of " + exponent + " is: ");
        System.out.println(result);
    }
}
