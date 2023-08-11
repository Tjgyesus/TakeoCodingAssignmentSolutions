import java.util.Scanner;

public class OneMultipleOfSecondInt {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            System.out.println("Enter the second number: ");
            int secondNumber = scanner.nextInt();

            if (secondNumber != 0 && firstNumber % secondNumber == 0) {
                System.out.println(firstNumber + " is a multiple of " + secondNumber);
            } else {
                System.out.println(firstNumber + " is not a multiple of " + secondNumber);
            }


        }
    }


